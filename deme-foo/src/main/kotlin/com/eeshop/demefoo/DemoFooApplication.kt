package com.eeshop.demefoo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class DemoFooApplication

fun main(args: Array<String>) {
	runApplication<DemoFooApplication>(*args)
}
