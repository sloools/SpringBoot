package com.example.eventpublisherkotlin.config

import com.example.eventpublisherkotlin.entity.SampleData
import org.springframework.context.annotation.Configuration
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.scheduling.annotation.EnableAsync


@Configuration
class SampleEventListener {

    @Async
    @EventListener
    fun sampleEventListener(event: SampleData){ // 실제 비동기로 처리해야 하는 로직을 구현하는 리스너
        try{
            println("====== Thread Sleep for 5 sec ======")
            Thread.sleep(3000)
            println("====== Get Event By EventListener =======")
            println("This Thread: ${Thread.currentThread()} , Name : ${event.name}name, age : ${event.age.toString()}")
        }catch (e: Exception){
            println("Exception Occured")
        }
    }

}