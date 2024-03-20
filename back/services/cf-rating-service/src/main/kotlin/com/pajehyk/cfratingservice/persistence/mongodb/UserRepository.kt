package com.pajehyk.cfratingservice.persistence.mongodb

import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.aggregation.AggregationResults
import org.springframework.data.mongodb.repository.Aggregation
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: MongoRepository<UserList, String> {
    @Aggregation(pipeline = ["{ \$sort: { fetchedAt: -1} }", "{ \$limit: 1}"])
    fun getRecent(): AggregationResults<UserList>
}