
package com.crescendo.ap.yelp_review_service.model.yelp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "businesses", "total", "region" })
public class BusinessResponse {

	@JsonProperty("businesses")
	private List<Business> businesses = null;
	@JsonProperty("total")
	private Integer total;
	@JsonProperty("region")
	private BusinessRegion region;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("businesses")
	public List<Business> getBusinesses() {
		return businesses;
	}

	@JsonProperty("businesses")
	public void setBusinesses(List<Business> businesses) {
		this.businesses = businesses;
	}

	@JsonProperty("total")
	public Integer getTotal() {
		return total;
	}

	@JsonProperty("total")
	public void setTotal(Integer total) {
		this.total = total;
	}

	@JsonProperty("region")
	public BusinessRegion getRegion() {
		return region;
	}

	@JsonProperty("region")
	public void setRegion(BusinessRegion region) {
		this.region = region;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
