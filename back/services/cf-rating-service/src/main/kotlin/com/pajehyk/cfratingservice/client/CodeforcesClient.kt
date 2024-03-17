package com.pajehyk.cfratingservice.client

import org.openapitools.client.apis.UserApi
import org.springframework.stereotype.Component

@Component
class CodeforcesClient(
    private val userApi: UserApi,
) {

    fun doSomething() {
        val something = userApi.userRatedListGet()
        val users = checkNotNull(something.result)
        println(users.first())
    }
}