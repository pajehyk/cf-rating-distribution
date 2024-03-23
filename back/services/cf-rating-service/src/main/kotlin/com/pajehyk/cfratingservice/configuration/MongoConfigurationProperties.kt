package com.pajehyk.cfratingservice.configuration

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties
data class MongoConfigurationProperties(
    val mongoUser: String,
    val mongoPassword: String,
)
