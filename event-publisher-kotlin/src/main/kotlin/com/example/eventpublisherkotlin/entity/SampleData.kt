package com.example.eventpublisherkotlin.entity

import com.example.eventpublisherkotlin.service.SendRecordService
import java.util.Objects


data class SampleData(
    val name: String,
    val age: String
)

//class SampleData{ // Before Spring 4.2 - Should Extend ApplicationEvent
//    var source: Objects
//    var name: String? = null
//    var age: String? = null
//
//    constructor(source: Objects){
//        this.source = source
//        this.name = name
//        this.age = age
//    }
//
//    constructor(source: SendRecordService, name: String, age: String): super(source) {
//        this.name = name
//        this.age = age
//    }
//}
