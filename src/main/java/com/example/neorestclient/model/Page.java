
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
    "size",
    "total_elements",
    "total_pages",
    "number"
})
public class Page {

    @JsonProperty("size")
    private Long size;
    
    @JsonProperty("total_elements")
    private Long totalElements;
    
    @JsonProperty("total_pages")
    private Long totalPages;
    
    @JsonProperty("number")
    private Long number;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("size")
    public Long getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Long size) {
        this.size = size;
    }

    public Page withSize(Long size) {
        this.size = size;
        return this;
    }

    @JsonProperty("total_elements")
    public Long getTotalElements() {
        return totalElements;
    }

    @JsonProperty("total_elements")
    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }

    public Page withTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    @JsonProperty("total_pages")
    public Long getTotalPages() {
        return totalPages;
    }

    @JsonProperty("total_pages")
    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public Page withTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Long number) {
        this.number = number;
    }

    public Page withNumber(Long number) {
        this.number = number;
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

    public Page withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("size", size).append("totalElements", totalElements).append("totalPages", totalPages).append("number", number).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(totalElements).append(number).append(totalPages).append(size).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Page) == false) {
            return false;
        }
        Page rhs = ((Page) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(totalElements, rhs.totalElements).append(number, rhs.number).append(totalPages, rhs.totalPages).append(size, rhs.size).isEquals();
    }

}
