/**
 * 
 */
package com.crescendo.ap.yelp_review_service.model.google_vision;

import java.util.HashMap;
import java.util.List;
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
@JsonPropertyOrder({ "vertices" })
public class GoogleVisionBoundingPoly {

	@JsonProperty("vertices")
	private List<GoogleVisionVertices> vertices = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("vertices")
	public List<GoogleVisionVertices> getVertices() {
		return vertices;
	}

	@JsonProperty("vertices")
	public void setVertices(List<GoogleVisionVertices> vertices) {
		this.vertices = vertices;
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
