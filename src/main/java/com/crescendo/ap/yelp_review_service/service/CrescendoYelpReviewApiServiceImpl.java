/**
 * 
 */
package com.crescendo.ap.yelp_review_service.service;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.crescendo.ap.yelp_review_service.model.google_vision.GoogleVisionRequests;
import com.crescendo.ap.yelp_review_service.model.google_vision.GoogleVisionResponse;
import com.crescendo.ap.yelp_review_service.model.yelp.BusinessResponse;
import com.crescendo.ap.yelp_review_service.model.yelp.ReviewsResponse;

/**
 * @author emacatan
 *
 */
@Service
public class CrescendoYelpReviewApiServiceImpl implements CrescendoYelpReviewApiService {

	private static final Logger LOG = Logger.getLogger(CrescendoYelpReviewApiServiceImpl.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.crescendo.ap.yelp_review_service.service.CrescendoYelpReviewApiService#
	 * searchBusiness(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public BusinessResponse searchBusiness(String location, String term, String categories) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<?> response = null;
		BusinessResponse businessResponse = new BusinessResponse();
		String uri = "https://api.yelp.com/v3/businesses/search";
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(uri).queryParam("categories", categories)
				.queryParam("term", term).queryParam("location", location);
		try {
			LOG.info("searchBusiness URI " + builder.toUriString());
			response = restTemplate.exchange(builder.toUriString(), HttpMethod.GET,
					new HttpEntity<>(setHttpHeaders(Boolean.TRUE)), BusinessResponse.class);
			businessResponse = (BusinessResponse) response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			businessResponse = new BusinessResponse();
		}
		return businessResponse;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.crescendo.ap.yelp_review_service.service.CrescendoYelpReviewApiService#
	 * getReviews(java.lang.String)
	 */
	@Override
	public ReviewsResponse getReviews(String id) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<?> response = null;
		ReviewsResponse reviewsResponse = new ReviewsResponse();
		String uri = "https://api.yelp.com/v3/businesses/{id}/reviews";
		Map<String, String> uriParams = new HashMap<String, String>();
		uriParams.put("id", id);
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(uri);

		LOG.info("getReviews " + builder.buildAndExpand(uriParams));
		LOG.info("getReviews id " + id);
		try {
			response = restTemplate.exchange(builder.buildAndExpand(uriParams).toUriString(), HttpMethod.GET,
					new HttpEntity<>(setHttpHeaders(Boolean.TRUE)), ReviewsResponse.class);
			reviewsResponse = (ReviewsResponse) response.getBody();
		} catch (Exception e) {
			LOG.info("getReviews " + e.getLocalizedMessage());
			reviewsResponse = new ReviewsResponse();
		}
		return reviewsResponse;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.crescendo.ap.yelp_review_service.service.CrescendoYelpReviewApiService#
	 * getGoogleVisionReview(com.crescendo.ap.yelp_review_service.model.
	 * google_vision.GoogleVisionRequests)
	 */
	@Override
	public GoogleVisionResponse getGoogleVisionReview(GoogleVisionRequests googleVisionRequests) {
		GoogleVisionResponse googleVisionResponse = new GoogleVisionResponse();
		String uri = "https://vision.googleapis.com/v1/images:annotate";
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(uri).queryParam("key",
				"AIzaSyBxXXTX5gKwo20urPXcF7y0GcfVUwaCrIg");
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<?> response = null;
		try {
			LOG.info("getGoogleVisionReview URI " + builder.toUriString());
			LOG.info("googleVisionRequests.getRequests " + googleVisionRequests.getRequests());
			response = restTemplate.exchange(builder.toUriString(), HttpMethod.POST,
					new HttpEntity<>(googleVisionRequests, setHttpHeaders(Boolean.FALSE)), GoogleVisionResponse.class);
			googleVisionResponse = (GoogleVisionResponse) response.getBody();
		} catch (Exception e) {
			LOG.info("getGoogleVisionReview " + e.getLocalizedMessage());
			googleVisionResponse = new GoogleVisionResponse();
		}
		return googleVisionResponse;
	}

	/**
	 * getToken
	 * 
	 * @return HttpHeaders with token if needed
	 */
	private HttpHeaders setHttpHeaders(Boolean Authorization) {
		HttpHeaders headers = new HttpHeaders();
		if (Authorization) {
			headers.set("Authorization", String.format("%s %s", "Bearer",
					"gvIJoQGorfXl0jEm7Rp73NWlNl7RRR_8hK4e86j8KjyqQ00V0SmxqlUMfXrsdnT4Yaln1RmnsKl_OcDQBqF00y5Rmii53XnO9HS1nnEtQL9nHWPHUxdHRtS7e_q0XXYx"));
		}
		headers.set("Content-Type", "application/json");
		headers.set("Accept", "application/json");
		return headers;
	}

}
