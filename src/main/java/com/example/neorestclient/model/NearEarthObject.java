
package com.example.neorestclient.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "links",
    "neo_reference_id",
    "name",
    "nasa_jpl_url",
    "absolute_magnitude_h",
    "estimated_diameter",
    "is_potentially_hazardous_asteroid",
    "close_approach_data",
    "orbital_data"
})
public class NearEarthObject {

    @JsonProperty("links")
    private Links_ links;
    @JsonProperty("neo_reference_id")
    private String neoReferenceId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nasa_jpl_url")
    private String nasaJplUrl;
    @JsonProperty("absolute_magnitude_h")
    private Double absoluteMagnitudeH;
    @JsonProperty("estimated_diameter")
    private EstimatedDiameter estimatedDiameter;
    @JsonProperty("is_potentially_hazardous_asteroid")
    private Boolean isPotentiallyHazardousAsteroid;
    @JsonProperty("close_approach_data")
    private List<CloseApproachDatum> closeApproachData = null;
    @JsonProperty("orbital_data")
    private OrbitalData orbitalData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("links")
    public Links_ getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links_ links) {
        this.links = links;
    }

    public NearEarthObject withLinks(Links_ links) {
        this.links = links;
        return this;
    }

    @JsonProperty("neo_reference_id")
    public String getNeoReferenceId() {
        return neoReferenceId;
    }

    @JsonProperty("neo_reference_id")
    public void setNeoReferenceId(String neoReferenceId) {
        this.neoReferenceId = neoReferenceId;
    }

    public NearEarthObject withNeoReferenceId(String neoReferenceId) {
        this.neoReferenceId = neoReferenceId;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public NearEarthObject withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("nasa_jpl_url")
    public String getNasaJplUrl() {
        return nasaJplUrl;
    }

    @JsonProperty("nasa_jpl_url")
    public void setNasaJplUrl(String nasaJplUrl) {
        this.nasaJplUrl = nasaJplUrl;
    }

    public NearEarthObject withNasaJplUrl(String nasaJplUrl) {
        this.nasaJplUrl = nasaJplUrl;
        return this;
    }

    @JsonProperty("absolute_magnitude_h")
    public Double getAbsoluteMagnitudeH() {
        return absoluteMagnitudeH;
    }

    @JsonProperty("absolute_magnitude_h")
    public void setAbsoluteMagnitudeH(Double absoluteMagnitudeH) {
        this.absoluteMagnitudeH = absoluteMagnitudeH;
    }

    public NearEarthObject withAbsoluteMagnitudeH(Double absoluteMagnitudeH) {
        this.absoluteMagnitudeH = absoluteMagnitudeH;
        return this;
    }

    @JsonProperty("estimated_diameter")
    public EstimatedDiameter getEstimatedDiameter() {
        return estimatedDiameter;
    }

    @JsonProperty("estimated_diameter")
    public void setEstimatedDiameter(EstimatedDiameter estimatedDiameter) {
        this.estimatedDiameter = estimatedDiameter;
    }

    public NearEarthObject withEstimatedDiameter(EstimatedDiameter estimatedDiameter) {
        this.estimatedDiameter = estimatedDiameter;
        return this;
    }

    @JsonProperty("is_potentially_hazardous_asteroid")
    public Boolean getIsPotentiallyHazardousAsteroid() {
        return isPotentiallyHazardousAsteroid;
    }

    @JsonProperty("is_potentially_hazardous_asteroid")
    public void setIsPotentiallyHazardousAsteroid(Boolean isPotentiallyHazardousAsteroid) {
        this.isPotentiallyHazardousAsteroid = isPotentiallyHazardousAsteroid;
    }

    public NearEarthObject withIsPotentiallyHazardousAsteroid(Boolean isPotentiallyHazardousAsteroid) {
        this.isPotentiallyHazardousAsteroid = isPotentiallyHazardousAsteroid;
        return this;
    }

    @JsonProperty("close_approach_data")
    public List<CloseApproachDatum> getCloseApproachData() {
        return closeApproachData;
    }

    @JsonProperty("close_approach_data")
    public void setCloseApproachData(List<CloseApproachDatum> closeApproachData) {
        this.closeApproachData = closeApproachData;
    }

    public NearEarthObject withCloseApproachData(List<CloseApproachDatum> closeApproachData) {
        this.closeApproachData = closeApproachData;
        return this;
    }

    @JsonProperty("orbital_data")
    public OrbitalData getOrbitalData() {
        return orbitalData;
    }

    @JsonProperty("orbital_data")
    public void setOrbitalData(OrbitalData orbitalData) {
        this.orbitalData = orbitalData;
    }

    public NearEarthObject withOrbitalData(OrbitalData orbitalData) {
        this.orbitalData = orbitalData;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public NearEarthObject withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("links", links).append("neoReferenceId", neoReferenceId).append("name", name).append("nasaJplUrl", nasaJplUrl).append("absoluteMagnitudeH", absoluteMagnitudeH).append("estimatedDiameter", estimatedDiameter).append("isPotentiallyHazardousAsteroid", isPotentiallyHazardousAsteroid).append("closeApproachData", closeApproachData).append("orbitalData", orbitalData).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(orbitalData).append(closeApproachData).append(neoReferenceId).append(additionalProperties).append(isPotentiallyHazardousAsteroid).append(estimatedDiameter).append(name).append(links).append(nasaJplUrl).append(absoluteMagnitudeH).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NearEarthObject) == false) {
            return false;
        }
        NearEarthObject rhs = ((NearEarthObject) other);
        return new EqualsBuilder().append(orbitalData, rhs.orbitalData).append(closeApproachData, rhs.closeApproachData).append(neoReferenceId, rhs.neoReferenceId).append(additionalProperties, rhs.additionalProperties).append(isPotentiallyHazardousAsteroid, rhs.isPotentiallyHazardousAsteroid).append(estimatedDiameter, rhs.estimatedDiameter).append(name, rhs.name).append(links, rhs.links).append(nasaJplUrl, rhs.nasaJplUrl).append(absoluteMagnitudeH, rhs.absoluteMagnitudeH).isEquals();
    }

}
