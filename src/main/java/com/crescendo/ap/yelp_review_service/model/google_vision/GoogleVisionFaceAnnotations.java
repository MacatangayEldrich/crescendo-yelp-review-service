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
@JsonPropertyOrder({ "boundingPoly", "fdBoundingPoly", "landmarks", "rollAngle", "panAngle", "tiltAngle",
		"detectionConfidence", "landmarkingConfidence", "joyLikelihood", "sorrowLikelihood", "angerLikelihood",
		"surpriseLikelihood", "underExposedLikelihood", "blurredLikelihood", "headwearLikelihood" })
public class GoogleVisionFaceAnnotations {
	@JsonProperty("boundingPoly")
    private GoogleVisionBoundingPoly boundingPoly;
    @JsonProperty("fdBoundingPoly")
    private GoogleVisionBoundingPoly fdBoundingPoly;
    @JsonProperty("landmarks")
    private List<GoogleVisionLandmark> landmarks = null;
    @JsonProperty("rollAngle")
    private Double rollAngle;
    @JsonProperty("panAngle")
    private Double panAngle;
    @JsonProperty("tiltAngle")
    private Double tiltAngle;
    @JsonProperty("detectionConfidence")
    private Double detectionConfidence;
    @JsonProperty("landmarkingConfidence")
    private Double landmarkingConfidence;
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

    @JsonProperty("boundingPoly")
    public GoogleVisionBoundingPoly getBoundingPoly() {
        return boundingPoly;
    }

    @JsonProperty("boundingPoly")
    public void setBoundingPoly(GoogleVisionBoundingPoly boundingPoly) {
        this.boundingPoly = boundingPoly;
    }

    @JsonProperty("fdBoundingPoly")
    public GoogleVisionBoundingPoly getFdBoundingPoly() {
        return fdBoundingPoly;
    }

    @JsonProperty("fdBoundingPoly")
    public void setFdBoundingPoly(GoogleVisionBoundingPoly fdBoundingPoly) {
        this.fdBoundingPoly = fdBoundingPoly;
    }

    @JsonProperty("landmarks")
    public List<GoogleVisionLandmark> getLandmarks() {
        return landmarks;
    }

    @JsonProperty("landmarks")
    public void setLandmarks(List<GoogleVisionLandmark> landmarks) {
        this.landmarks = landmarks;
    }

    @JsonProperty("rollAngle")
    public Double getRollAngle() {
        return rollAngle;
    }

    @JsonProperty("rollAngle")
    public void setRollAngle(Double rollAngle) {
        this.rollAngle = rollAngle;
    }

    @JsonProperty("panAngle")
    public Double getPanAngle() {
        return panAngle;
    }

    @JsonProperty("panAngle")
    public void setPanAngle(Double panAngle) {
        this.panAngle = panAngle;
    }

    @JsonProperty("tiltAngle")
    public Double getTiltAngle() {
        return tiltAngle;
    }

    @JsonProperty("tiltAngle")
    public void setTiltAngle(Double tiltAngle) {
        this.tiltAngle = tiltAngle;
    }

    @JsonProperty("detectionConfidence")
    public Double getDetectionConfidence() {
        return detectionConfidence;
    }

    @JsonProperty("detectionConfidence")
    public void setDetectionConfidence(Double detectionConfidence) {
        this.detectionConfidence = detectionConfidence;
    }

    @JsonProperty("landmarkingConfidence")
    public Double getLandmarkingConfidence() {
        return landmarkingConfidence;
    }

    @JsonProperty("landmarkingConfidence")
    public void setLandmarkingConfidence(Double landmarkingConfidence) {
        this.landmarkingConfidence = landmarkingConfidence;
    }

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
