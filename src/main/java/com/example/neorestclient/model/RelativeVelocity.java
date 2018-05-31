
package com.example.neorestclient.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "kilometers_per_second",
    "kilometers_per_hour",
    "miles_per_hour"
})
public class RelativeVelocity {

    @JsonProperty("kilometers_per_second")
    private String kilometersPerSecond;
    
    @JsonProperty("kilometers_per_hour")
    private String kilometersPerHour;
    
    @JsonProperty("miles_per_hour")
    private String milesPerHour;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("kilometers_per_second")
    public String getKilometersPerSecond() {
        return kilometersPerSecond;
    }

    @JsonProperty("kilometers_per_second")
    public void setKilometersPerSecond(String kilometersPerSecond) {
        this.kilometersPerSecond = kilometersPerSecond;
    }

    public RelativeVelocity withKilometersPerSecond(String kilometersPerSecond) {
        this.kilometersPerSecond = kilometersPerSecond;
        return this;
    }

    @JsonProperty("kilometers_per_hour")
    public String getKilometersPerHour() {
        return kilometersPerHour;
    }

    @JsonProperty("kilometers_per_hour")
    public void setKilometersPerHour(String kilometersPerHour) {
        this.kilometersPerHour = kilometersPerHour;
    }

    public RelativeVelocity withKilometersPerHour(String kilometersPerHour) {
        this.kilometersPerHour = kilometersPerHour;
        return this;
    }

    @JsonProperty("miles_per_hour")
    public String getMilesPerHour() {
        return milesPerHour;
    }

    @JsonProperty("miles_per_hour")
    public void setMilesPerHour(String milesPerHour) {
        this.milesPerHour = milesPerHour;
    }

    public RelativeVelocity withMilesPerHour(String milesPerHour) {
        this.milesPerHour = milesPerHour;
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

    public RelativeVelocity withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("kilometersPerSecond", kilometersPerSecond).append("kilometersPerHour", kilometersPerHour).append("milesPerHour", milesPerHour).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(kilometersPerHour).append(additionalProperties).append(milesPerHour).append(kilometersPerSecond).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RelativeVelocity) == false) {
            return false;
        }
        RelativeVelocity rhs = ((RelativeVelocity) other);
        return new EqualsBuilder().append(kilometersPerHour, rhs.kilometersPerHour).append(additionalProperties, rhs.additionalProperties).append(milesPerHour, rhs.milesPerHour).append(kilometersPerSecond, rhs.kilometersPerSecond).isEquals();
    }

}
