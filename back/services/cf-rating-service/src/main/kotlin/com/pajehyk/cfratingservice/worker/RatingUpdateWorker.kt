package com.pajehyk.cfratingservice.worker

import com.pajehyk.cfratingservice.client.CodeforcesClient
import com.pajehyk.cfratingservice.persistence.mongodb.UserRepository
import com.pajehyk.cfratingservice.service.UserListService
import kotlinx.coroutines.runBlocking
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class RatingUpdateWorker(
    private val codeforcesClient: CodeforcesClient,
    private val userRepository: UserRepository,
    private val userListService: UserListService,
) {

    @Scheduled(fixedRate = 5000)
    fun updateCfRatings() {
        val userList = runBlocking {
            codeforcesClient.getUserList()
        }
        userRepository.save(userList)
        userListService.updateUserList(userList)
    }


    companion object {
        const val RATING_UPDATE_RATE: Long = 60*60*1000 // 1 hour to ms
    }
}