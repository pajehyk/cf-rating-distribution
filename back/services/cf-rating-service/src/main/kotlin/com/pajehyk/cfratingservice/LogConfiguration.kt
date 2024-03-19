package com.pajehyk.cfratingservice

import mu.KotlinLogging
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class LogConfiguration {

    @Bean
    fun logger() = KotlinLogging.logger {  }
}