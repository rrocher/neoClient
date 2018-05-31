package com.example.neorestclient.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.neorestclient.model.NearEarthObject;
import com.example.neorestclient.model.NeoCollection;

@Service
public class NeoClientImpl implements NeoClient{
	private static final Logger log = LoggerFactory.getLogger(NeoClientImpl.class);
	
    private final RestTemplate restTemplate;
    
    @Value("${nasa.web.service}")
    private String webServiceRoot;
    
    @Value("${nasa.demo.key}")
    private String apiKey;
    
	public NeoClientImpl(RestTemplateBuilder restTemplateBuilder) {
		restTemplate = restTemplateBuilder.build();
    }

	public NearEarthObject getLargestNeo(List<NearEarthObject> neos) {		
		Validate.notNull(neos);
		Validate.notEmpty(neos);
		
		final Comparator<NearEarthObject> comp = (p1, p2) -> Float.compare( p1.getEstimatedDiameter().getKilometers().getEstimatedMeanDiameter(), p2.getEstimatedDiameter().getKilometers().getEstimatedMeanDiameter());
    
		NearEarthObject largest = neos
			      .stream()
			      .max(comp)
			      .orElseThrow(NoSuchElementException::new);
		
		return largest;
		
	}

	@Override
	public NearEarthObject getClosestNeo() {
		List<NearEarthObject> neos = getNeos().getNearEarthObjects();
		return getClosestNeo(neos);
	}

	@Override
	public List<NearEarthObject> getNeoBetweenDates(Date startDate, Date endDate) {

		Validate.notNull(startDate);
		Validate.notNull(endDate);
		
		String url = webServiceRoot+"feed?start_date={startDate}&end_date={endDate}&api_key="+apiKey;
		
		NearEarthObject[] forNow =  restTemplate.getForObject(url,
				NearEarthObject[].class, startDate.toString(), startDate.toString(), endDate.toString());
		
		if (forNow == null || forNow.length == 0)
			return new ArrayList<>();
		
		return Arrays.asList(forNow);
	}

	@Override
	public NeoCollection getNeos() {
		try {
			String url = webServiceRoot+"neo/browse?api_key="+apiKey;
			return  restTemplate.getForObject("https://api.nasa.gov/neo/rest/v1/neo/browse?api_key=DEMO_KEY",
					NeoCollection.class);
		}
		catch (Exception ex) {
			log.error("Something went wrong when getting the list of neo's, throwing exception");
			return null;
		}
	}

	@Override
	public NearEarthObject getNeoById(String id) {
		Validate.notNull(id);

		String url = webServiceRoot+"neo/{id}?api_key="+apiKey;
		
		return restTemplate.getForObject(url,
				NearEarthObject.class, id);
	}

	@Override
	public NearEarthObject getLargestNeo() {
		List<NearEarthObject> neos = getNeos().getNearEarthObjects();
		
		return getLargestNeo(neos);
	}

	@Override
	public NearEarthObject getClosestNeo(List<NearEarthObject> neos) {
		final Comparator<NearEarthObject> comp = (p1, p2) -> Float.compare( p1.getEstimatedDiameter().getKilometers().getEstimatedMeanDiameter(), p2.getEstimatedDiameter().getKilometers().getEstimatedMeanDiameter());
	    
		NearEarthObject closest = neos
			      .stream()
			      .max(comp)
			      .orElseThrow(NoSuchElementException::new);
		
		return closest;
	}
	
}
