package com.eeshop.demefoo.controller

import com.eeshop.demefoo.model.User
import com.eeshop.demefoo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class  DemoController{
    @Autowired
    private lateinit var userService:UserService

    @Value("\${ret}")
    lateinit var ret:String

    @RequestMapping("/hi")
    fun hi():String=ret

    @RequestMapping("/all")
    fun all():List<User> = userService.queryAll()

}