package com.example.neorestclient.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CloseApproachData {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Date closeApproachDate;
    
	Long epochDateCloseApproach;
	
	RelativeVelocity relativeVelocity;
	
	MissDistance missDistance;
	
	String orbitingBody;
	
	
	public CloseApproachData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getCloseApproachDate() {
		return closeApproachDate;
	}

	public void setCloseApproachDate(Date closeApproachDate) {
		this.closeApproachDate = closeApproachDate;
	}

	public Long getEpochDateCloseApproach() {
		return epochDateCloseApproach;
	}

	public void setEpochDateCloseApproach(Long epochDateCloseApproach) {
		this.epochDateCloseApproach = epochDateCloseApproach;
	}

	public RelativeVelocity getRelativeVelocity() {
		return relativeVelocity;
	}

	public void setRelativeVelocity(RelativeVelocity relativeVelocity) {
		this.relativeVelocity = relativeVelocity;
	}

	public MissDistance getMissDistance() {
		return missDistance;
	}

	public void setMissDistance(MissDistance missDistance) {
		this.missDistance = missDistance;
	}

	public String getOrbitingBody() {
		return orbitingBody;
	}

	public void setOrbitingBody(String orbitingBody) {
		this.orbitingBody = orbitingBody;
	} 
	
	

}
