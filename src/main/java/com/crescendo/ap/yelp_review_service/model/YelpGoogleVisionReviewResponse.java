/**
 * 
 */
package com.crescendo.ap.yelp_review_service.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.crescendo.ap.yelp_review_service.model.GoogleVisionResponseCall;
import com.crescendo.ap.yelp_review_service.model.yelp.Business;
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
@JsonPropertyOrder({ "responses" })
public class YelpGoogleVisionReviewResponse {

	@JsonProperty("responses")
	private List<YelpGoogleVisionReviewResponses> responses = null;

	/**
	 * @return the responses
	 */
	public List<YelpGoogleVisionReviewResponses> getResponses() {
		return responses;
	}

	/**
	 * @param responses the responses to set
	 */
	public void setResponses(List<YelpGoogleVisionReviewResponses> responses) {
		this.responses = responses;
	}

}
