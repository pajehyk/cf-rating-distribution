package com.pajehyk.cfratingservice.persistence.mongodb

import org.openapitools.client.models.UserRatedListResponse
import org.springframework.data.annotation.Id
import java.time.Instant

data class UserList(
    val userList: List<User>,
    val fetchedAt: Instant,
) {

    @Id
    lateinit var id: String
    companion object {
        fun fromDto(userRatedListResponse: UserRatedListResponse, instant: Instant) = UserList(
            userList = userRatedListResponse.result?.map { User.fromDto(it) } ?: emptyList(),
            fetchedAt = instant,
        )
    }
}