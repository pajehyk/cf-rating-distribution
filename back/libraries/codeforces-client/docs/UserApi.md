# UserApi

All URIs are relative to *https://codeforces.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userRatedListGet**](UserApi.md#userRatedListGet) | **GET** /user.ratedList | Get users information


<a id="userRatedListGet"></a>
# **userRatedListGet**
> UserRatedListResponse userRatedListGet(activeOnly, includeRetired, contestId)

Get users information



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserApi()
val activeOnly : kotlin.Boolean = true // kotlin.Boolean | Boolean. If true then only users, who participated in rated contest during the last month are returned. Otherwise, all users with at least one rated contest are returned.
val includeRetired : kotlin.Boolean = true // kotlin.Boolean | Boolean. If true, the method returns all rated users, otherwise the method returns only users, that were online at last month.
val contestId : kotlin.Int = 56 // kotlin.Int | Id of the contest. It is not the round number. It can be seen in contest URL. For example /contest/566/status
try {
    val result : UserRatedListResponse = apiInstance.userRatedListGet(activeOnly, includeRetired, contestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#userRatedListGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#userRatedListGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activeOnly** | **kotlin.Boolean**| Boolean. If true then only users, who participated in rated contest during the last month are returned. Otherwise, all users with at least one rated contest are returned. | [optional]
 **includeRetired** | **kotlin.Boolean**| Boolean. If true, the method returns all rated users, otherwise the method returns only users, that were online at last month. | [optional]
 **contestId** | **kotlin.Int**| Id of the contest. It is not the round number. It can be seen in contest URL. For example /contest/566/status | [optional]

### Return type

[**UserRatedListResponse**](UserRatedListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

