package com.pajehyk.cfratingservice.client

import org.openapitools.client.apis.UserApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import io.ktor.client.*
import io.ktor.client.engine.*
import io.ktor.client.engine.java.*
import okhttp3.OkHttpClient
import java.time.Duration

@Configuration
class Configuration {

    @Bean
    fun client() = OkHttpClient
        .Builder()
        .readTimeout(Duration.ofMinutes(1))
        .build()

    @Bean
    fun userApi(client: OkHttpClient) = UserApi(client = client)
}