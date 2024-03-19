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

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.UserApi
import org.openapitools.client.models.UserRatedListResponse

class UserApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UserApi
        //val apiInstance = UserApi()

        // to test userRatedListGet
        should("test userRatedListGet") {
            // uncomment below to test userRatedListGet
            //val contentType : kotlin.String = contentType_example // kotlin.String | 
            //val activeOnly : kotlin.Boolean = true // kotlin.Boolean | Boolean. If true then only users, who participated in rated contest during the last month are returned. Otherwise, all users with at least one rated contest are returned.
            //val includeRetired : kotlin.Boolean = true // kotlin.Boolean | Boolean. If true, the method returns all rated users, otherwise the method returns only users, that were online at last month.
            //val contestId : kotlin.Int = 56 // kotlin.Int | Id of the contest. It is not the round number. It can be seen in contest URL. For example /contest/566/status
            //val result : UserRatedListResponse = apiInstance.userRatedListGet(contentType, activeOnly, includeRetired, contestId)
            //result shouldBe ("TODO")
        }

    }
}
