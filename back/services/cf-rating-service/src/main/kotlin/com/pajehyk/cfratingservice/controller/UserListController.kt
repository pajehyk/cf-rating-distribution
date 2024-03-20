package com.pajehyk.cfratingservice.controller

import com.pajehyk.cfratingservice.service.UserListService
import com.pajehyk.generated.server.api.RatingsApi
import com.pajehyk.generated.server.model.Rating
import com.pajehyk.generated.server.model.RatingsResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserListController(
    private val userListService: UserListService,
): RatingsApi {

    override fun ratingsGet(): ResponseEntity<RatingsResponse> {
        val abc = userListService.recentUserList()
        val ratingResponse = RatingsResponse().ratings(abc.userList.map { Rating().value(it.rating) })
        return ResponseEntity.ok(
            ratingResponse
        )
    }
}