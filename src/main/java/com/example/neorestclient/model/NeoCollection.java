package com.example.neorestclient.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "links",
    "page",
    "near_earth_objects"
})
public class NeoCollection {

    @JsonProperty("links")
	Links links;
	
    @JsonProperty("page")
	Page page;

    @JsonProperty("near_earth_objects")
	List<NearEarthObject> nearEarthObjects= null;
	
	public NeoCollection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Links getLinks() {
		return links;
	}
	public void setLinks(Links links) {
		this.links = links;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public List<NearEarthObject> getNearEarthObjects() {
		return nearEarthObjects;
	}
	public void setNearEathObjects(List<NearEarthObject> nearEarthObjects) {
		this.nearEarthObjects = nearEarthObjects;
	}
	
}
