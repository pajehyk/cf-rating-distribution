package com.pajehyk.cfratingservice

import com.pajehyk.cfratingservice.configuration.MongoConfigurationProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties(MongoConfigurationProperties::class)
class CfRatingServiceApplication

fun main(args: Array<String>) {
	runApplication<CfRatingServiceApplication>(*args)
}
