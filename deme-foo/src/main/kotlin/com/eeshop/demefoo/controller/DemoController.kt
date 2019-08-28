package com.eeshop.demefoo.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class  DemoController{
    @Value("\${ret}")
    lateinit  var ret:String

    @RequestMapping("/hi")
    fun hi():String=ret
}