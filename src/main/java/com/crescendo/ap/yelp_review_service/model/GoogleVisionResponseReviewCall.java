/**
 * 
 */
package com.crescendo.ap.yelp_review_service.model;

import com.crescendo.ap.yelp_review_service.model.yelp.Review;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author emacatan
 *
 */
public class GoogleVisionResponseReviewCall {
	
	@JsonProperty("userReview")
	private Review review;

	@JsonProperty("googleVisionResponse")
	private GoogleVisionResponseCall googleVisionResponseCall;

	/**
	 * @return the review
	 */
	public Review getReview() {
		return review;
	}

	/**
	 * @param review the review to set
	 */
	public void setReview(Review review) {
		this.review = review;
	}

	/**
	 * @return the googleVisionResponseCall
	 */
	public GoogleVisionResponseCall getGoogleVisionResponseCall() {
		return googleVisionResponseCall;
	}

	/**
	 * @param googleVisionResponseCall the googleVisionResponseCall to set
	 */
	public void setGoogleVisionResponseCall(GoogleVisionResponseCall googleVisionResponseCall) {
		this.googleVisionResponseCall = googleVisionResponseCall;
	}
	
}
