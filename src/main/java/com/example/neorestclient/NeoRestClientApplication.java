package com.example.neorestclient;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.neorestclient.client.NeoClient;
import com.example.neorestclient.model.NearEarthObject;
import com.example.neorestclient.model.NeoCollection;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class NeoRestClientApplication implements ApplicationRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(NeoRestClientApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(NeoRestClientApplication.class, args);
	}

	@Autowired
	NeoClient neoClient;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		logger.info("getting list of neo...");
		
		NeoCollection neos = neoClient.getNeos();
		
		if (neos == null || 
			neos.getNearEarthObjects() == null || 
			neos.getNearEarthObjects().isEmpty()) {
			logger.error("Something went wrong, could not get the list of near earth object, please check your connection...");
			return;
		}
		
		ObjectMapper mapper = new ObjectMapper();
		String indented = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(neos);
		
		System.out.println("List of NEO:");
		System.out.println(indented);
		
		NearEarthObject neo = neoClient.getLargestNeo(neos.getNearEarthObjects());
		indented = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(neo);
		
		System.out.println("Largest NEO:");
		System.out.println(indented); 
		
		neo = neoClient.getClosestNeo(neos.getNearEarthObjects());
		indented = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(neo);
		
		System.out.println("Closest NEO:");
		System.out.println(indented);
		
		logger.info("Complete. You may exit now!");
		return;
	}
	
	
}
