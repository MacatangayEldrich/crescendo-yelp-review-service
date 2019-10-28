/**
 * 
 */
package com.crescendo.ap.yelp_review_service.api;

import org.springframework.http.ResponseEntity;

import com.crescendo.ap.yelp_review_service.model.YelpGoogleVisionReviewResponse;
import com.crescendo.ap.yelp_review_service.model.google_vision.GoogleVisionRequests;
import com.crescendo.ap.yelp_review_service.model.google_vision.GoogleVisionResponse;
import com.crescendo.ap.yelp_review_service.model.yelp.BusinessResponse;
import com.crescendo.ap.yelp_review_service.model.yelp.ReviewsResponse;

/**
 * @author emacatan
 *
 */
public interface ApiDelegate {

	/**
	 * @see Api#searchBusiness
	 */
	ResponseEntity<BusinessResponse> searchBusiness(String location, String term, String categories);

	/**
	 * @see Api#getReviews
	 */
	ResponseEntity<ReviewsResponse> getReviews(String id);

	/**
	 * @see Api#getGoogleVisionReview
	 */
	ResponseEntity<GoogleVisionResponse> getGoogleVisionReview(GoogleVisionRequests googleVisionRequests);
	
}