/**
 * 
 */
package com.crescendo.ap.yelp_review_service.model.google_vision;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author emacatan
 *
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "x", "y", "z" })
public class GoogleVisionPosition {

	@JsonProperty("x")
	private Double x;
	@JsonProperty("y")
	private Double y;
	@JsonProperty("z")
	private Double z;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("x")
	public Double getX() {
		return x;
	}

	@JsonProperty("x")
	public void setX(Double x) {
		this.x = x;
	}

	@JsonProperty("y")
	public Double getY() {
		return y;
	}

	@JsonProperty("y")
	public void setY(Double y) {
		this.y = y;
	}

	@JsonProperty("z")
	public Double getZ() {
		return z;
	}

	@JsonProperty("z")
	public void setZ(Double z) {
		this.z = z;
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
