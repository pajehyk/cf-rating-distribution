package com.pajehyk.cfratingservice.service

import com.pajehyk.cfratingservice.persistence.mongodb.UserList
import com.pajehyk.cfratingservice.persistence.mongodb.UserRepository
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import kotlin.concurrent.Volatile

@Service
class UserListService(
    private val userRepository: UserRepository,
) {
    @Volatile
    lateinit var userList: UserList

    fun recentUserList(): UserList {
        if (this::userList.isInitialized) {
            return userList
        }

        userList = userRepository.getRecent().uniqueMappedResult!!
        return userList
    }

    fun updateUserList(userList: UserList) {
        this.userList = userList
    }
}