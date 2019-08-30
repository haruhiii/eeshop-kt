package com.eeshop.demefoo.service

import com.eeshop.demefoo.model.User
import org.springframework.stereotype.Service

interface UserService {
    fun deleteUser(Id:String):Boolean
    fun queryUserById():User
    fun queryUserByLoginName(loginName:String):User
    fun delUserById(loginName:String):User
    fun queryAll():List<User>
}