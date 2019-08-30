package com.eeshop.demefoo

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BaseTest {

    @Autowired
    lateinit var tmp:TestRestTemplate


    fun<T> ass(response:ResponseEntity<T>,expected:T){
        println(response)
        assertNotNull(response)
        assertEquals(response.body,expected)
        assertEquals(response.statusCode,HttpStatus.OK)
    }
}