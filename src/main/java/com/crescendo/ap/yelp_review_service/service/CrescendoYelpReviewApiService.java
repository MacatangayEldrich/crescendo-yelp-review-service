/**
 * 
 */
package com.crescendo.ap.yelp_review_service.service;

import com.crescendo.ap.yelp_review_service.model.YelpGoogleVisionReviewResponse;
import com.crescendo.ap.yelp_review_service.model.google_vision.GoogleVisionRequests;
import com.crescendo.ap.yelp_review_service.model.google_vision.GoogleVisionResponse;
import com.crescendo.ap.yelp_review_service.model.yelp.BusinessResponse;
import com.crescendo.ap.yelp_review_service.model.yelp.ReviewsResponse;

/**
 * @author emacatan
 *
 */
public interface CrescendoYelpReviewApiService {

	BusinessResponse searchBusiness(String location, String term, String categories);

	ReviewsResponse getReviews(String id);
	
	GoogleVisionResponse getGoogleVisionReview(GoogleVisionRequests googleVisionRequests);
}