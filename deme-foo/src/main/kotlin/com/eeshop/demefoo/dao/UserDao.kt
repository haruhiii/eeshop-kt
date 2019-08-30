package com.eeshop.demefoo.dao

import com.eeshop.demefoo.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserDao : JpaRepository<User, Integer>