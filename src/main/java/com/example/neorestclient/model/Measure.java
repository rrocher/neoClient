package com.example.neorestclient.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "estimated_diameter_min",
    "estimated_diameter_max"
})
public class Measure {
    @JsonProperty("estimated_diameter_min")
	Float estimatedDiameterMin;
    @JsonProperty("estimated_diameter_max")
	Float estimatedDiameterMax;
	public Measure() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Float getEstimatedDiameterMin() {
		return estimatedDiameterMin;
	}
	public void setEstimatedDiameterMin(Float estimatedDiameterMin) {
		this.estimatedDiameterMin = estimatedDiameterMin;
	}
	public Float getEstimatedDiameterMax() {
		return estimatedDiameterMax;
	}
	public void setEstimatedDiameterMax(Float estimatedDiameterMax) {
		this.estimatedDiameterMax = estimatedDiameterMax;
	}
	
	public Float getEstimatedMeanDiameter() {
		return (estimatedDiameterMax+estimatedDiameterMin)/2;
		
	}
	
}
