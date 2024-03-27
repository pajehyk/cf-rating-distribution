package com.pajehyk.cfratingservice.controller

import com.pajehyk.cfratingservice.service.UserListService
import com.pajehyk.generated.server.api.RatingsApi
import com.pajehyk.generated.server.model.Rating
import com.pajehyk.generated.server.model.RatingsResponse
import mu.KLogger
import org.springframework.http.HttpHeaders
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.time.OffsetDateTime
import java.time.ZoneId

@RestController
class UserListController(
    private val userListService: UserListService,
    private val logger: KLogger,
): RatingsApi {

    override fun ratingsGet(): ResponseEntity<RatingsResponse> {
        logger.info { "Received /ratings request" }
        val userList = userListService.recentUserList()
        val ratingResponse = RatingsResponse()
            .ratings(userList.userList.map { Rating().value(it.rating) })
            .dateUpdated(OffsetDateTime.ofInstant(userList.fetchedAt, ZoneId.of("Europe/Moscow")))
        val headers = HttpHeaders()
        headers.accessControlAllowOrigin = "*"
        val response = ResponseEntity.ok().headers(headers).body(ratingResponse)
        return response
    }
}