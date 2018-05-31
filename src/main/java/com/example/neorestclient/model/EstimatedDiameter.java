
package com.example.neorestclient.model;

import java.util.HashMap;
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
    "kilometers",
    "meters",
    "miles",
    "feet"
})
public class EstimatedDiameter {

    @JsonProperty("kilometers")
    private Measure kilometers;
    @JsonProperty("meters")
    private Measure meters;
    @JsonProperty("miles")
    private Measure miles;
    @JsonProperty("feet")
    private Measure feet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("kilometers")
    public Measure getKilometers() {
        return kilometers;
    }

    @JsonProperty("kilometers")
    public void setKilometers(Measure kilometers) {
        this.kilometers = kilometers;
    }

    public EstimatedDiameter withKilometers(Measure kilometers) {
        this.kilometers = kilometers;
        return this;
    }

    @JsonProperty("meters")
    public Measure getMeters() {
        return meters;
    }

    @JsonProperty("meters")
    public void setMeters(Measure meters) {
        this.meters = meters;
    }

    public EstimatedDiameter withMeters(Measure meters) {
        this.meters = meters;
        return this;
    }

    @JsonProperty("miles")
    public Measure getMiles() {
        return miles;
    }

    @JsonProperty("miles")
    public void setMiles(Measure miles) {
        this.miles = miles;
    }

    public EstimatedDiameter withMiles(Measure miles) {
        this.miles = miles;
        return this;
    }

    @JsonProperty("feet")
    public Measure getFeet() {
        return feet;
    }

    @JsonProperty("feet")
    public void setFeet(Measure feet) {
        this.feet = feet;
    }

    public EstimatedDiameter withFeet(Measure feet) {
        this.feet = feet;
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

    public EstimatedDiameter withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("kilometers", kilometers).append("meters", meters).append("miles", miles).append("feet", feet).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(meters).append(additionalProperties).append(feet).append(kilometers).append(miles).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EstimatedDiameter) == false) {
            return false;
        }
        EstimatedDiameter rhs = ((EstimatedDiameter) other);
        return new EqualsBuilder().append(meters, rhs.meters).append(additionalProperties, rhs.additionalProperties).append(feet, rhs.feet).append(kilometers, rhs.kilometers).append(miles, rhs.miles).isEquals();
    }

}
