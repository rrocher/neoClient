package com.example.neorestclient.client;

import java.util.Date;
import java.util.List;

import com.example.neorestclient.model.NearEarthObject;
import com.example.neorestclient.model.NeoCollection;

public interface NeoClient {
	
	public List<NearEarthObject> getNeoBetweenDates(Date startDate, Date endDate);
	public NeoCollection getNeos();
	public NearEarthObject getLargestNeo();
	public NearEarthObject getClosestNeo();
	public NearEarthObject getNeoById(String id);
	public NearEarthObject getLargestNeo(List<NearEarthObject> neos);
	public NearEarthObject getClosestNeo(List<NearEarthObject> neos);

}
