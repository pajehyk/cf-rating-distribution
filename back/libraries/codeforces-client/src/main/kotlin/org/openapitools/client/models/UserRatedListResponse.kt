/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.User

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param status 
 * @param result 
 */


data class UserRatedListResponse (

    @Json(name = "status")
    val status: kotlin.String? = null,

    @Json(name = "result")
    val result: kotlin.collections.List<User>? = null

)

