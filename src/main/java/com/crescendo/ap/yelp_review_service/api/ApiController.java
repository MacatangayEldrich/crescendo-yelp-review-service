package com.crescendo.ap.yelp_review_service.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crescendo.ap.yelp_review_service.model.YelpGoogleVisionReviewResponse;
import com.crescendo.ap.yelp_review_service.model.google_vision.GoogleVisionRequests;
import com.crescendo.ap.yelp_review_service.model.google_vision.GoogleVisionResponse;
import com.crescendo.ap.yelp_review_service.model.yelp.BusinessResponse;
import com.crescendo.ap.yelp_review_service.model.yelp.ReviewsResponse;

/**
 * @author emacatan
 *
 */
@RestController
public class ApiController {

	private final ApiDelegate delegate;

	@Autowired
	public ApiController(ApiDelegate delegate) {
		this.delegate = delegate;
	}

	@RequestMapping(value = "/v1/business/search", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<BusinessResponse> searchBusiness(
			@Valid @RequestParam(value = "location", required = true) String location,
			@Valid @RequestParam(value = "term", required = false) String term,
			@Valid @RequestParam(value = "categories", required = false) String categories) {
		return delegate.searchBusiness(location, term, categories);
	}

	@RequestMapping(path = "/v1/business/{id}/reviews", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<ReviewsResponse> getReviews(@PathVariable("id") String id) {
		return delegate.getReviews(id);
	}

	@RequestMapping(path = "/v1/google/vision/reviews", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<GoogleVisionResponse> getGoogleVisionReview(
			@RequestBody GoogleVisionRequests googleVisionRequests) {
		return delegate.getGoogleVisionReview(googleVisionRequests);
	}
}
