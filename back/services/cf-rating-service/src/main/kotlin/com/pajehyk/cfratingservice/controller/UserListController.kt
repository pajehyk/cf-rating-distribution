package com.pajehyk.cfratingservice.controller

import com.pajehyk.cfratingservice.service.UserListService
import com.pajehyk.generated.server.api.RatingsApi
import com.pajehyk.generated.server.model.Rating
import com.pajehyk.generated.server.model.RatingsResponse
import mu.KLogger
import org.springframework.http.HttpHeaders
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class UserListController(
    private val userListService: UserListService,
    private val logger: KLogger,
): RatingsApi {

    override fun ratingsGet(): ResponseEntity<RatingsResponse> {
        logger.info { "Received /ratings request" }
        val abc = userListService.recentUserList()
        val ratingResponse = RatingsResponse().ratings(abc.userList.map { Rating().value(it.rating) })
        val headers = HttpHeaders()
        headers.accessControlAllowOrigin = "*"
        val response = ResponseEntity.ok().headers(headers).body(ratingResponse)
        return response
    }
}