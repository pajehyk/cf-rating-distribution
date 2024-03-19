package com.pajehyk.cfratingservice.persistence.mongodb

import org.openapitools.client.models.User as UserDto

data class User(
    val handle: String,
    val rating: Int,
) {
    companion object {
        fun fromDto(user: UserDto) = User(
            handle = user.handle,
            rating = user.rating
        )
    }
}

