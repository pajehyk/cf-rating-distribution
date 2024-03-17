package com.pajehyk.cfratingservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class CfRatingServiceApplication

fun main(args: Array<String>) {
	runApplication<CfRatingServiceApplication>(*args)
}
