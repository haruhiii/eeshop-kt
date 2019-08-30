package com.eeshop.demefoo.model

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user")
class User:Serializable{

    @Id @GeneratedValue
    var keyId = ""
    var userName = ""
}