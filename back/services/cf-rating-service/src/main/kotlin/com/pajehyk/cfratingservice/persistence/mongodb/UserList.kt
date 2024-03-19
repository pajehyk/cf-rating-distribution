package com.pajehyk.cfratingservice.persistence.mongodb

import org.openapitools.client.models.UserRatedListResponse
import org.springframework.data.annotation.Id

data class UserList(
    val userList: List<User>
) {

    @Id
    lateinit var id: String
    companion object {
        fun fromDto(userRatedListResponse: UserRatedListResponse) = UserList(
            userList = userRatedListResponse.result?.map { User.fromDto(it) } ?: emptyList()
        )
    }
}