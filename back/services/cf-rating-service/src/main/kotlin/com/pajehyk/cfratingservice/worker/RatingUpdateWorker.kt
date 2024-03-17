package com.pajehyk.cfratingservice.worker

import com.pajehyk.cfratingservice.client.CodeforcesClient
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class RatingUpdateWorker(
    private val codeforcesClient: CodeforcesClient,
) {

    @Scheduled(fixedRate = 5000)
    fun print() {
        codeforcesClient.doSomething()
    }
}