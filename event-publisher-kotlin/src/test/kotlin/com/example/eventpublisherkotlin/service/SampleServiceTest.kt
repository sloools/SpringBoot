package com.example.eventpublisherkotlin.service

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SampleServiceTest @Autowired constructor(
    private val sampleService: SampleService
) {
    @Test
    fun sampleServiceTest(){
        val name = "Song"
        val age = "30"

        sampleService.sendRecord(name, age)

        Thread.sleep(10000)
        println("This thread : ${Thread.currentThread()}")
    }
}