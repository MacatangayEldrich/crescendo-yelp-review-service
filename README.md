crescendo-yelp-review-service

run mvn clean install spring-boot:run

endpoints:
To get business
Query parameters:
`` term
`` location
`` categories
http://localhost:8080/v1/business/search

to get reviews of business
``{id}
http://localhost:8080/v1/business/{id}/reviews

to get GoogleVision Review 
http://localhost:8080/v1/google/vision/reviews
With parameter
{
  "requests":[
    {
      "image":{
        "source":{
          "imageUri":
            "https://s3-media4.fl.yelpcdn.com/photo/V4_05PXSdK23B6bVe_Hg1A/o.jpg"
        }
      },
      "features":[
        {
          "type":"FACE_DETECTION",
          "maxResults": 1
        }
      ]
    }
  ]
}