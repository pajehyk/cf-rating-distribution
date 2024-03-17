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

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import org.openapitools.client.models.UserRatedListResponse

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class UserApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://codeforces.com/api")
        }
    }

    /**
     * Get users information
     * 
     * @param activeOnly Boolean. If true then only users, who participated in rated contest during the last month are returned. Otherwise, all users with at least one rated contest are returned. (optional)
     * @param includeRetired Boolean. If true, the method returns all rated users, otherwise the method returns only users, that were online at last month. (optional)
     * @param contestId Id of the contest. It is not the round number. It can be seen in contest URL. For example /contest/566/status (optional)
     * @return UserRatedListResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun userRatedListGet(activeOnly: kotlin.Boolean? = null, includeRetired: kotlin.Boolean? = null, contestId: kotlin.Int? = null) : UserRatedListResponse {
        val localVarResponse = userRatedListGetWithHttpInfo(activeOnly = activeOnly, includeRetired = includeRetired, contestId = contestId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UserRatedListResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get users information
     * 
     * @param activeOnly Boolean. If true then only users, who participated in rated contest during the last month are returned. Otherwise, all users with at least one rated contest are returned. (optional)
     * @param includeRetired Boolean. If true, the method returns all rated users, otherwise the method returns only users, that were online at last month. (optional)
     * @param contestId Id of the contest. It is not the round number. It can be seen in contest URL. For example /contest/566/status (optional)
     * @return ApiResponse<UserRatedListResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun userRatedListGetWithHttpInfo(activeOnly: kotlin.Boolean?, includeRetired: kotlin.Boolean?, contestId: kotlin.Int?) : ApiResponse<UserRatedListResponse?> {
        val localVariableConfig = userRatedListGetRequestConfig(activeOnly = activeOnly, includeRetired = includeRetired, contestId = contestId)

        return request<Unit, UserRatedListResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation userRatedListGet
     *
     * @param activeOnly Boolean. If true then only users, who participated in rated contest during the last month are returned. Otherwise, all users with at least one rated contest are returned. (optional)
     * @param includeRetired Boolean. If true, the method returns all rated users, otherwise the method returns only users, that were online at last month. (optional)
     * @param contestId Id of the contest. It is not the round number. It can be seen in contest URL. For example /contest/566/status (optional)
     * @return RequestConfig
     */
    fun userRatedListGetRequestConfig(activeOnly: kotlin.Boolean?, includeRetired: kotlin.Boolean?, contestId: kotlin.Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (activeOnly != null) {
                    put("activeOnly", listOf(activeOnly.toString()))
                }
                if (includeRetired != null) {
                    put("includeRetired", listOf(includeRetired.toString()))
                }
                if (contestId != null) {
                    put("contestId", listOf(contestId.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/user.ratedList",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
