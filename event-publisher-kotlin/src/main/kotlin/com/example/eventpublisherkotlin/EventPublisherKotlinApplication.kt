package com.example.eventpublisherkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
@EnableAsync
class EventPublisherKotlinApplication

fun main(args: Array<String>) {
    runApplication<EventPublisherKotlinApplication>(*args)
}
