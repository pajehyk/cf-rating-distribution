# OpenApiCfRatingService.RatingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ratingsGet**](RatingApi.md#ratingsGet) | **GET** /ratings | Get users rating



## ratingsGet

> RatingsResponse ratingsGet()

Get users rating



### Example

```javascript
import OpenApiCfRatingService from 'open_api_cf_rating_service';

let apiInstance = new OpenApiCfRatingService.RatingApi();
apiInstance.ratingsGet((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**RatingsResponse**](RatingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

