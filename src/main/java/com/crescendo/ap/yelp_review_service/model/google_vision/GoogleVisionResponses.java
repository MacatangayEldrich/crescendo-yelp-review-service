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
@JsonPropertyOrder({ "faceAnnotations" })
public class GoogleVisionResponses {

	@JsonProperty("faceAnnotations")
	private List<GoogleVisionFaceAnnotations> faceAnnotations = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("faceAnnotations")
	public List<GoogleVisionFaceAnnotations> getFaceAnnotations() {
		return faceAnnotations;
	}

	@JsonProperty("faceAnnotations")
	public void setFaceAnnotations(List<GoogleVisionFaceAnnotations> faceAnnotations) {
		this.faceAnnotations = faceAnnotations;
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
