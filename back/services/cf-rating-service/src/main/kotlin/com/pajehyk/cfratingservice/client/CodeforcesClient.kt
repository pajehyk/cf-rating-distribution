package com.pajehyk.cfratingservice.client

import com.pajehyk.cfratingservice.persistence.mongodb.UserList
import mu.KLogger
import org.openapitools.client.apis.UserApi
import org.springframework.stereotype.Component
import java.time.Clock

@Component
class CodeforcesClient(
    private val userApi: UserApi,
    private val logger: KLogger,
    private val clock: Clock,
) {

    suspend fun getUserList(): UserList {
        logger.info { "Trying to get rated user list from codeforces" }
        val userList = userApi
                .userRatedListGet("application/json", null, null, null)

        return UserList.fromDto(userList, clock.instant())
    }

}