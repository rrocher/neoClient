
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
    "astronomical",
    "lunar",
    "kilometers",
    "miles"
})
public class MissDistance {

    @JsonProperty("astronomical")
    private String astronomical;
    @JsonProperty("lunar")
    private String lunar;
    @JsonProperty("kilometers")
    private String kilometers;
    @JsonProperty("miles")
    private String miles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("astronomical")
    public String getAstronomical() {
        return astronomical;
    }

    @JsonProperty("astronomical")
    public void setAstronomical(String astronomical) {
        this.astronomical = astronomical;
    }

    public MissDistance withAstronomical(String astronomical) {
        this.astronomical = astronomical;
        return this;
    }

    @JsonProperty("lunar")
    public String getLunar() {
        return lunar;
    }

    @JsonProperty("lunar")
    public void setLunar(String lunar) {
        this.lunar = lunar;
    }

    public MissDistance withLunar(String lunar) {
        this.lunar = lunar;
        return this;
    }

    @JsonProperty("kilometers")
    public String getKilometers() {
        return kilometers;
    }

    @JsonProperty("kilometers")
    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    public MissDistance withKilometers(String kilometers) {
        this.kilometers = kilometers;
        return this;
    }

    @JsonProperty("miles")
    public String getMiles() {
        return miles;
    }

    @JsonProperty("miles")
    public void setMiles(String miles) {
        this.miles = miles;
    }

    public MissDistance withMiles(String miles) {
        this.miles = miles;
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

    public MissDistance withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("astronomical", astronomical).append("lunar", lunar).append("kilometers", kilometers).append("miles", miles).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(astronomical).append(additionalProperties).append(kilometers).append(lunar).append(miles).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MissDistance) == false) {
            return false;
        }
        MissDistance rhs = ((MissDistance) other);
        return new EqualsBuilder().append(astronomical, rhs.astronomical).append(additionalProperties, rhs.additionalProperties).append(kilometers, rhs.kilometers).append(lunar, rhs.lunar).append(miles, rhs.miles).isEquals();
    }

}
