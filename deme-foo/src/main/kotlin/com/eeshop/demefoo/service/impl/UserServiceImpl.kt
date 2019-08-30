package com.eeshop.demefoo.service.impl

import com.eeshop.demefoo.dao.UserDao
import com.eeshop.demefoo.model.User
import com.eeshop.demefoo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class UserServiceImpl:UserService{
    @Autowired
    private lateinit var userDao:UserDao

    override fun queryAll(): List<User> = userDao.findAll()

    override fun queryUserById(): User {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun queryUserByLoginName(loginName: String): User {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delUserById(loginName: String): User {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteUser(Id: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}