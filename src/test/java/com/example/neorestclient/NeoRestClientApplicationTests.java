package com.example.neorestclient;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.neorestclient.NeoRestClientApplication;
import com.example.neorestclient.client.NeoClient;
import com.example.neorestclient.model.NearEarthObject;
import com.example.neorestclient.model.NeoCollection;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=NeoRestClientApplication.class)
public class NeoRestClientApplicationTests {

	@Autowired
	NeoClient neoClient;
	
	@Test
	public void test1() throws JsonProcessingException {
		NeoCollection neos = neoClient.getNeos();
		Assert.assertNotNull(neos);
		Assert.assertNotNull(neos.getNearEarthObjects());
		Assert.assertNotEquals(0, neos.getNearEarthObjects());
		ObjectMapper mapper = new ObjectMapper();
		String indented = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(neos);
		Assert.assertNotNull(indented);
	}
	

	@Test
	public void test2() throws JsonProcessingException {
		NearEarthObject neo = neoClient.getLargestNeo();
		Assert.assertNotNull(neo);
		ObjectMapper mapper = new ObjectMapper();
		String indented = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(neo);
		Assert.assertNotNull(indented);
	}
	
	@Test
	public void test3() throws JsonProcessingException {
		NearEarthObject neo = neoClient.getClosestNeo();
		Assert.assertNotNull(neo);
		ObjectMapper mapper = new ObjectMapper();
		String indented = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(neo);
		Assert.assertNotNull(indented);
	}


}
