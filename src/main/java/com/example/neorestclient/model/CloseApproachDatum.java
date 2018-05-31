
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
    "close_approach_date",
    "epoch_date_close_approach",
    "relative_velocity",
    "miss_distance",
    "orbiting_body"
})
public class CloseApproachDatum {

    @JsonProperty("close_approach_date")
    private String closeApproachDate;
    @JsonProperty("epoch_date_close_approach")
    private Long epochDateCloseApproach;
    @JsonProperty("relative_velocity")
    private RelativeVelocity relativeVelocity;
    @JsonProperty("miss_distance")
    private MissDistance missDistance;
    @JsonProperty("orbiting_body")
    private String orbitingBody;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("close_approach_date")
    public String getCloseApproachDate() {
        return closeApproachDate;
    }

    @JsonProperty("close_approach_date")
    public void setCloseApproachDate(String closeApproachDate) {
        this.closeApproachDate = closeApproachDate;
    }

    public CloseApproachDatum withCloseApproachDate(String closeApproachDate) {
        this.closeApproachDate = closeApproachDate;
        return this;
    }

    @JsonProperty("epoch_date_close_approach")
    public Long getEpochDateCloseApproach() {
        return epochDateCloseApproach;
    }

    @JsonProperty("epoch_date_close_approach")
    public void setEpochDateCloseApproach(Long epochDateCloseApproach) {
        this.epochDateCloseApproach = epochDateCloseApproach;
    }

    public CloseApproachDatum withEpochDateCloseApproach(Long epochDateCloseApproach) {
        this.epochDateCloseApproach = epochDateCloseApproach;
        return this;
    }

    @JsonProperty("relative_velocity")
    public RelativeVelocity getRelativeVelocity() {
        return relativeVelocity;
    }

    @JsonProperty("relative_velocity")
    public void setRelativeVelocity(RelativeVelocity relativeVelocity) {
        this.relativeVelocity = relativeVelocity;
    }

    public CloseApproachDatum withRelativeVelocity(RelativeVelocity relativeVelocity) {
        this.relativeVelocity = relativeVelocity;
        return this;
    }

    @JsonProperty("miss_distance")
    public MissDistance getMissDistance() {
        return missDistance;
    }

    @JsonProperty("miss_distance")
    public void setMissDistance(MissDistance missDistance) {
        this.missDistance = missDistance;
    }

    public CloseApproachDatum withMissDistance(MissDistance missDistance) {
        this.missDistance = missDistance;
        return this;
    }

    @JsonProperty("orbiting_body")
    public String getOrbitingBody() {
        return orbitingBody;
    }

    @JsonProperty("orbiting_body")
    public void setOrbitingBody(String orbitingBody) {
        this.orbitingBody = orbitingBody;
    }

    public CloseApproachDatum withOrbitingBody(String orbitingBody) {
        this.orbitingBody = orbitingBody;
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

    public CloseApproachDatum withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("closeApproachDate", closeApproachDate).append("epochDateCloseApproach", epochDateCloseApproach).append("relativeVelocity", relativeVelocity).append("missDistance", missDistance).append("orbitingBody", orbitingBody).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(epochDateCloseApproach).append(closeApproachDate).append(additionalProperties).append(missDistance).append(relativeVelocity).append(orbitingBody).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CloseApproachDatum) == false) {
            return false;
        }
        CloseApproachDatum rhs = ((CloseApproachDatum) other);
        return new EqualsBuilder().append(epochDateCloseApproach, rhs.epochDateCloseApproach).append(closeApproachDate, rhs.closeApproachDate).append(additionalProperties, rhs.additionalProperties).append(missDistance, rhs.missDistance).append(relativeVelocity, rhs.relativeVelocity).append(orbitingBody, rhs.orbitingBody).isEquals();
    }

}
