package com.example.eventpublisherkotlin.service

import com.example.eventpublisherkotlin.entity.SampleData
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class SendRecordService(
    private val publisher: ApplicationEventPublisher
) {

    fun sendRecord(name: String, age: String){ // 이벤트 리스너를 호출하는 공통 함수
        Thread.sleep(3000)
        val sampleData = SampleData( name, age)
        publisher.publishEvent(sampleData)
        println("======= Sending Event Publisher =======")
        println("This thread : ${Thread.currentThread()} , Name : $name, age : $age")

    }
}