/**
 * 
 */
package com.crescendo.ap.yelp_review_service.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.crescendo.ap.yelp_review_service.model.GoogleVisionResponseCall;
import com.crescendo.ap.yelp_review_service.model.yelp.Business;
import com.crescendo.ap.yelp_review_service.model.yelp.Review;
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
@JsonPropertyOrder({ "userReview", "business", "googleVisionResponse" })
public class YelpGoogleVisionReviewResponses implements Serializable {

	private static final long serialVersionUID = 556529632731789394L;

	@JsonProperty("reviewGoogleVision")
	private List<GoogleVisionResponseReviewCall> reviewGoogleVision = null;
	
	@JsonProperty("business")
	private Business business;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("business")
	public Business getBusiness() {
		return business;
	}

	@JsonProperty("business")
	public void setBusiness(Business business) {
		this.business = business;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	/**
	 * @return the reviewGoogleVision
	 */
	public List<GoogleVisionResponseReviewCall> getReviewGoogleVision() {
		return reviewGoogleVision;
	}

	/**
	 * @param reviewGoogleVision the reviewGoogleVision to set
	 */
	public void setReviewGoogleVision(List<GoogleVisionResponseReviewCall> reviewGoogleVision) {
		this.reviewGoogleVision = reviewGoogleVision;
	}

}
