package com.eeshop.demefoo.controller

import com.eeshop.demefoo.BaseTest
import com.eeshop.demefoo.model.User
import org.junit.Test

class DemoControllerTest : BaseTest() {

    @Test
    fun hi() {
        var res= tmp.getForEntity("/hi", String::class.java)
        ass(res,"s's")
    }

    @Test
    fun insertUser() {
        var user: User = User()
        var res= tmp.postForEntity("/create",user, String::class.java)
        ass(res,"s's")
    }

    @Test
    fun queryUserById(){
        var res = tmp.getForEntity("queryUserById",String::class.java)
    }

    @Test
    fun all(){
        var res = tmp.getForEntity("all",String::class.java)
        ass(res,"s's")

    }


}