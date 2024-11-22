package com.alejandromateo.hexagonal

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.core.env.StandardEnvironment

@SpringBootApplication(
    scanBasePackages = ["com.alejandromateo"],
)
open class SpringApp

fun main(args: Array<String>) {
    try {
        val environment = StandardEnvironment()
        val app = SpringApplication(SpringApp::class.java)
        app.setEnvironment(environment)
        app.run(*args)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
