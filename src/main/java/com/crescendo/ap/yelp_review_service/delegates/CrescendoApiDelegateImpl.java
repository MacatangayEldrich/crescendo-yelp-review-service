/**
 * 
 */
package com.crescendo.ap.yelp_review_service.delegates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.crescendo.ap.yelp_review_service.api.ApiDelegate;
import com.crescendo.ap.yelp_review_service.model.YelpGoogleVisionReviewResponse;
import com.crescendo.ap.yelp_review_service.model.google_vision.GoogleVisionRequests;
import com.crescendo.ap.yelp_review_service.model.google_vision.GoogleVisionResponse;
import com.crescendo.ap.yelp_review_service.model.yelp.BusinessResponse;
import com.crescendo.ap.yelp_review_service.model.yelp.ReviewsResponse;
import com.crescendo.ap.yelp_review_service.service.CrescendoYelpReviewApiService;

/**
 * @author emacatan
 *
 */
@Component
public class CrescendoApiDelegateImpl implements ApiDelegate {

	@Autowired
	CrescendoYelpReviewApiService crescendoYelpReviewApiService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.crescendo.ap.yelp_review_service.api.ApiDelegate#searchBusiness(java.lang
	 * .String, java.lang.String, java.lang.String)
	 */
	public ResponseEntity<BusinessResponse> searchBusiness(String location, String term, String categories) {
		return new ResponseEntity<>(crescendoYelpReviewApiService.searchBusiness(location, term, categories),
				HttpStatus.OK);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.crescendo.ap.yelp_review_service.api.ApiDelegate#getReviews(java.lang.
	 * String)
	 */
	@Override
	public ResponseEntity<ReviewsResponse> getReviews(String id) {
		return new ResponseEntity<>(crescendoYelpReviewApiService.getReviews(id), HttpStatus.OK);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.crescendo.ap.yelp_review_service.api.ApiDelegate#getGoogleVisionReview(
	 * com.crescendo.ap.yelp_review_service.model.google_vision.
	 * GoogleVisionRequests)
	 */
	@Override
	public ResponseEntity<GoogleVisionResponse> getGoogleVisionReview(GoogleVisionRequests googleVisionRequests) {
		return new ResponseEntity<>(crescendoYelpReviewApiService.getGoogleVisionReview(googleVisionRequests),
				HttpStatus.OK);
	}

}
