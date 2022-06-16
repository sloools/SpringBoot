package com.example.eventpublisherkotlin.service

import org.springframework.stereotype.Service

@Service
class SampleService(
    private val sendRecordService: SendRecordService
) {

    fun sendRecord(name: String, age: String){ // 일반 함수
        println("====== Before Call Event ====== This thread : ${Thread.currentThread()}")
        sendRecordService.sendRecord(name, age)
        println("====== After Call Event ======")
    }
}