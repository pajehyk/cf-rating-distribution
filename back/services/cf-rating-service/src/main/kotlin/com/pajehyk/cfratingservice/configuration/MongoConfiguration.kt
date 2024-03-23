package com.pajehyk.cfratingservice.configuration

import com.mongodb.MongoClientSettings
import com.mongodb.MongoCredential
import com.mongodb.ServerAddress
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import com.mongodb.connection.ClusterSettings
import com.mongodb.connection.SslSettings
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MongoConfiguration {

    @Bean
    fun mongoClient(mongoConfigurationProperties: MongoConfigurationProperties): MongoClient {
        return MongoClients
            .create(
                MongoClientSettings
                    .builder()
                    .applyToSslSettings { builder: SslSettings.Builder ->
                        builder.enabled(true)
                    }
                    .applyToClusterSettings { builder: ClusterSettings.Builder ->
                        builder.hosts(
                            buildList {
                                add(ServerAddress("rc1b-nft8u8u9jypk883g.mdb.yandexcloud.net", 27018))
                            }
                        )
                    }
                    .credential(
                        MongoCredential
                            .createCredential(
                                mongoConfigurationProperties.mongoUser,
                                "cf-rating",
                                mongoConfigurationProperties.mongoPassword.toCharArray()
                            )
                    )
                    .build()
            )
    }
}