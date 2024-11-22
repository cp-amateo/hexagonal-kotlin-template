package com.alejandromateo.hexagonal.infrastructure.adapters.inbound.api

import com.alejandromateo.hexagonal.application.CustomerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ExampleController(
    private val customerRepository: CustomerRepository
) {

    @GetMapping("/hello")
    fun sayHello(): String? {
        val customer = customerRepository.findById(1)

        return customer?.name
    }
}
