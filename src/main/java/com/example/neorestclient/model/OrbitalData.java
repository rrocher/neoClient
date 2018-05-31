
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
    "orbit_id",
    "orbit_determination_date",
    "orbit_uncertainty",
    "minimum_orbit_intersection",
    "jupiter_tisserand_invariant",
    "epoch_osculation",
    "eccentricity",
    "semi_major_axis",
    "inclination",
    "ascending_node_longitude",
    "orbital_period",
    "perihelion_distance",
    "perihelion_argument",
    "aphelion_distance",
    "perihelion_time",
    "mean_anomaly",
    "mean_motion",
    "equinox"
})
public class OrbitalData {

    @JsonProperty("orbit_id")
    private String orbitId;
    @JsonProperty("orbit_determination_date")
    private String orbitDeterminationDate;
    @JsonProperty("orbit_uncertainty")
    private String orbitUncertainty;
    @JsonProperty("minimum_orbit_intersection")
    private String minimumOrbitIntersection;
    @JsonProperty("jupiter_tisserand_invariant")
    private String jupiterTisserandInvariant;
    @JsonProperty("epoch_osculation")
    private String epochOsculation;
    @JsonProperty("eccentricity")
    private String eccentricity;
    @JsonProperty("semi_major_axis")
    private String semiMajorAxis;
    @JsonProperty("inclination")
    private String inclination;
    @JsonProperty("ascending_node_longitude")
    private String ascendingNodeLongitude;
    @JsonProperty("orbital_period")
    private String orbitalPeriod;
    @JsonProperty("perihelion_distance")
    private String perihelionDistance;
    @JsonProperty("perihelion_argument")
    private String perihelionArgument;
    @JsonProperty("aphelion_distance")
    private String aphelionDistance;
    @JsonProperty("perihelion_time")
    private String perihelionTime;
    @JsonProperty("mean_anomaly")
    private String meanAnomaly;
    @JsonProperty("mean_motion")
    private String meanMotion;
    @JsonProperty("equinox")
    private String equinox;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("orbit_id")
    public String getOrbitId() {
        return orbitId;
    }

    @JsonProperty("orbit_id")
    public void setOrbitId(String orbitId) {
        this.orbitId = orbitId;
    }

    public OrbitalData withOrbitId(String orbitId) {
        this.orbitId = orbitId;
        return this;
    }

    @JsonProperty("orbit_determination_date")
    public String getOrbitDeterminationDate() {
        return orbitDeterminationDate;
    }

    @JsonProperty("orbit_determination_date")
    public void setOrbitDeterminationDate(String orbitDeterminationDate) {
        this.orbitDeterminationDate = orbitDeterminationDate;
    }

    public OrbitalData withOrbitDeterminationDate(String orbitDeterminationDate) {
        this.orbitDeterminationDate = orbitDeterminationDate;
        return this;
    }

    @JsonProperty("orbit_uncertainty")
    public String getOrbitUncertainty() {
        return orbitUncertainty;
    }

    @JsonProperty("orbit_uncertainty")
    public void setOrbitUncertainty(String orbitUncertainty) {
        this.orbitUncertainty = orbitUncertainty;
    }

    public OrbitalData withOrbitUncertainty(String orbitUncertainty) {
        this.orbitUncertainty = orbitUncertainty;
        return this;
    }

    @JsonProperty("minimum_orbit_intersection")
    public String getMinimumOrbitIntersection() {
        return minimumOrbitIntersection;
    }

    @JsonProperty("minimum_orbit_intersection")
    public void setMinimumOrbitIntersection(String minimumOrbitIntersection) {
        this.minimumOrbitIntersection = minimumOrbitIntersection;
    }

    public OrbitalData withMinimumOrbitIntersection(String minimumOrbitIntersection) {
        this.minimumOrbitIntersection = minimumOrbitIntersection;
        return this;
    }

    @JsonProperty("jupiter_tisserand_invariant")
    public String getJupiterTisserandInvariant() {
        return jupiterTisserandInvariant;
    }

    @JsonProperty("jupiter_tisserand_invariant")
    public void setJupiterTisserandInvariant(String jupiterTisserandInvariant) {
        this.jupiterTisserandInvariant = jupiterTisserandInvariant;
    }

    public OrbitalData withJupiterTisserandInvariant(String jupiterTisserandInvariant) {
        this.jupiterTisserandInvariant = jupiterTisserandInvariant;
        return this;
    }

    @JsonProperty("epoch_osculation")
    public String getEpochOsculation() {
        return epochOsculation;
    }

    @JsonProperty("epoch_osculation")
    public void setEpochOsculation(String epochOsculation) {
        this.epochOsculation = epochOsculation;
    }

    public OrbitalData withEpochOsculation(String epochOsculation) {
        this.epochOsculation = epochOsculation;
        return this;
    }

    @JsonProperty("eccentricity")
    public String getEccentricity() {
        return eccentricity;
    }

    @JsonProperty("eccentricity")
    public void setEccentricity(String eccentricity) {
        this.eccentricity = eccentricity;
    }

    public OrbitalData withEccentricity(String eccentricity) {
        this.eccentricity = eccentricity;
        return this;
    }

    @JsonProperty("semi_major_axis")
    public String getSemiMajorAxis() {
        return semiMajorAxis;
    }

    @JsonProperty("semi_major_axis")
    public void setSemiMajorAxis(String semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public OrbitalData withSemiMajorAxis(String semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
        return this;
    }

    @JsonProperty("inclination")
    public String getInclination() {
        return inclination;
    }

    @JsonProperty("inclination")
    public void setInclination(String inclination) {
        this.inclination = inclination;
    }

    public OrbitalData withInclination(String inclination) {
        this.inclination = inclination;
        return this;
    }

    @JsonProperty("ascending_node_longitude")
    public String getAscendingNodeLongitude() {
        return ascendingNodeLongitude;
    }

    @JsonProperty("ascending_node_longitude")
    public void setAscendingNodeLongitude(String ascendingNodeLongitude) {
        this.ascendingNodeLongitude = ascendingNodeLongitude;
    }

    public OrbitalData withAscendingNodeLongitude(String ascendingNodeLongitude) {
        this.ascendingNodeLongitude = ascendingNodeLongitude;
        return this;
    }

    @JsonProperty("orbital_period")
    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    @JsonProperty("orbital_period")
    public void setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public OrbitalData withOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
        return this;
    }

    @JsonProperty("perihelion_distance")
    public String getPerihelionDistance() {
        return perihelionDistance;
    }

    @JsonProperty("perihelion_distance")
    public void setPerihelionDistance(String perihelionDistance) {
        this.perihelionDistance = perihelionDistance;
    }

    public OrbitalData withPerihelionDistance(String perihelionDistance) {
        this.perihelionDistance = perihelionDistance;
        return this;
    }

    @JsonProperty("perihelion_argument")
    public String getPerihelionArgument() {
        return perihelionArgument;
    }

    @JsonProperty("perihelion_argument")
    public void setPerihelionArgument(String perihelionArgument) {
        this.perihelionArgument = perihelionArgument;
    }

    public OrbitalData withPerihelionArgument(String perihelionArgument) {
        this.perihelionArgument = perihelionArgument;
        return this;
    }

    @JsonProperty("aphelion_distance")
    public String getAphelionDistance() {
        return aphelionDistance;
    }

    @JsonProperty("aphelion_distance")
    public void setAphelionDistance(String aphelionDistance) {
        this.aphelionDistance = aphelionDistance;
    }

    public OrbitalData withAphelionDistance(String aphelionDistance) {
        this.aphelionDistance = aphelionDistance;
        return this;
    }

    @JsonProperty("perihelion_time")
    public String getPerihelionTime() {
        return perihelionTime;
    }

    @JsonProperty("perihelion_time")
    public void setPerihelionTime(String perihelionTime) {
        this.perihelionTime = perihelionTime;
    }

    public OrbitalData withPerihelionTime(String perihelionTime) {
        this.perihelionTime = perihelionTime;
        return this;
    }

    @JsonProperty("mean_anomaly")
    public String getMeanAnomaly() {
        return meanAnomaly;
    }

    @JsonProperty("mean_anomaly")
    public void setMeanAnomaly(String meanAnomaly) {
        this.meanAnomaly = meanAnomaly;
    }

    public OrbitalData withMeanAnomaly(String meanAnomaly) {
        this.meanAnomaly = meanAnomaly;
        return this;
    }

    @JsonProperty("mean_motion")
    public String getMeanMotion() {
        return meanMotion;
    }

    @JsonProperty("mean_motion")
    public void setMeanMotion(String meanMotion) {
        this.meanMotion = meanMotion;
    }

    public OrbitalData withMeanMotion(String meanMotion) {
        this.meanMotion = meanMotion;
        return this;
    }

    @JsonProperty("equinox")
    public String getEquinox() {
        return equinox;
    }

    @JsonProperty("equinox")
    public void setEquinox(String equinox) {
        this.equinox = equinox;
    }

    public OrbitalData withEquinox(String equinox) {
        this.equinox = equinox;
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

    public OrbitalData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("orbitId", orbitId).append("orbitDeterminationDate", orbitDeterminationDate).append("orbitUncertainty", orbitUncertainty).append("minimumOrbitIntersection", minimumOrbitIntersection).append("jupiterTisserandInvariant", jupiterTisserandInvariant).append("epochOsculation", epochOsculation).append("eccentricity", eccentricity).append("semiMajorAxis", semiMajorAxis).append("inclination", inclination).append("ascendingNodeLongitude", ascendingNodeLongitude).append("orbitalPeriod", orbitalPeriod).append("perihelionDistance", perihelionDistance).append("perihelionArgument", perihelionArgument).append("aphelionDistance", aphelionDistance).append("perihelionTime", perihelionTime).append("meanAnomaly", meanAnomaly).append("meanMotion", meanMotion).append("equinox", equinox).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(perihelionTime).append(orbitUncertainty).append(meanMotion).append(perihelionArgument).append(orbitalPeriod).append(jupiterTisserandInvariant).append(inclination).append(meanAnomaly).append(epochOsculation).append(ascendingNodeLongitude).append(eccentricity).append(minimumOrbitIntersection).append(orbitId).append(semiMajorAxis).append(additionalProperties).append(aphelionDistance).append(perihelionDistance).append(equinox).append(orbitDeterminationDate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrbitalData) == false) {
            return false;
        }
        OrbitalData rhs = ((OrbitalData) other);
        return new EqualsBuilder().append(perihelionTime, rhs.perihelionTime).append(orbitUncertainty, rhs.orbitUncertainty).append(meanMotion, rhs.meanMotion).append(perihelionArgument, rhs.perihelionArgument).append(orbitalPeriod, rhs.orbitalPeriod).append(jupiterTisserandInvariant, rhs.jupiterTisserandInvariant).append(inclination, rhs.inclination).append(meanAnomaly, rhs.meanAnomaly).append(epochOsculation, rhs.epochOsculation).append(ascendingNodeLongitude, rhs.ascendingNodeLongitude).append(eccentricity, rhs.eccentricity).append(minimumOrbitIntersection, rhs.minimumOrbitIntersection).append(orbitId, rhs.orbitId).append(semiMajorAxis, rhs.semiMajorAxis).append(additionalProperties, rhs.additionalProperties).append(aphelionDistance, rhs.aphelionDistance).append(perihelionDistance, rhs.perihelionDistance).append(equinox, rhs.equinox).append(orbitDeterminationDate, rhs.orbitDeterminationDate).isEquals();
    }

}
