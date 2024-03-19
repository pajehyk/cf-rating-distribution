package com.pajehyk.cfratingservice.client

import com.pajehyk.cfratingservice.persistence.mongodb.UserList
import mu.KLogger
import org.openapitools.client.apis.UserApi
import org.springframework.stereotype.Component

@Component
class CodeforcesClient(
    private val userApi: UserApi,
    private val logger: KLogger,
) {

    suspend fun getUserList(): UserList {
        logger.info { "Trying to get rated user list from codeforces" }
        val userList = userApi
                .userRatedListGet("application/json", null, null, null)

        return UserList.fromDto(userList)
    }

}