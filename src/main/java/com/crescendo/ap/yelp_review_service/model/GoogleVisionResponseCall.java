/**
 * 
 */
package com.crescendo.ap.yelp_review_service.model;

import java.util.HashMap;
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
@JsonPropertyOrder({ "joyLikelihood", "sorrowLikelihood", "angerLikelihood", "surpriseLikelihood",
		"underExposedLikelihood", "blurredLikelihood", "headwearLikelihood" })
public class GoogleVisionResponseCall {

	@JsonProperty("joyLikelihood")
	private String joyLikelihood;
	@JsonProperty("sorrowLikelihood")
	private String sorrowLikelihood;
	@JsonProperty("angerLikelihood")
	private String angerLikelihood;
	@JsonProperty("surpriseLikelihood")
	private String surpriseLikelihood;
	@JsonProperty("underExposedLikelihood")
	private String underExposedLikelihood;
	@JsonProperty("blurredLikelihood")
	private String blurredLikelihood;
	@JsonProperty("headwearLikelihood")
	private String headwearLikelihood;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("joyLikelihood")
	public String getJoyLikelihood() {
		return joyLikelihood;
	}

	@JsonProperty("joyLikelihood")
	public void setJoyLikelihood(String joyLikelihood) {
		this.joyLikelihood = joyLikelihood;
	}

	@JsonProperty("sorrowLikelihood")
	public String getSorrowLikelihood() {
		return sorrowLikelihood;
	}

	@JsonProperty("sorrowLikelihood")
	public void setSorrowLikelihood(String sorrowLikelihood) {
		this.sorrowLikelihood = sorrowLikelihood;
	}

	@JsonProperty("angerLikelihood")
	public String getAngerLikelihood() {
		return angerLikelihood;
	}

	@JsonProperty("angerLikelihood")
	public void setAngerLikelihood(String angerLikelihood) {
		this.angerLikelihood = angerLikelihood;
	}

	@JsonProperty("surpriseLikelihood")
	public String getSurpriseLikelihood() {
		return surpriseLikelihood;
	}

	@JsonProperty("surpriseLikelihood")
	public void setSurpriseLikelihood(String surpriseLikelihood) {
		this.surpriseLikelihood = surpriseLikelihood;
	}

	@JsonProperty("underExposedLikelihood")
	public String getUnderExposedLikelihood() {
		return underExposedLikelihood;
	}

	@JsonProperty("underExposedLikelihood")
	public void setUnderExposedLikelihood(String underExposedLikelihood) {
		this.underExposedLikelihood = underExposedLikelihood;
	}

	@JsonProperty("blurredLikelihood")
	public String getBlurredLikelihood() {
		return blurredLikelihood;
	}

	@JsonProperty("blurredLikelihood")
	public void setBlurredLikelihood(String blurredLikelihood) {
		this.blurredLikelihood = blurredLikelihood;
	}

	@JsonProperty("headwearLikelihood")
	public String getHeadwearLikelihood() {
		return headwearLikelihood;
	}

	@JsonProperty("headwearLikelihood")
	public void setHeadwearLikelihood(String headwearLikelihood) {
		this.headwearLikelihood = headwearLikelihood;
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
