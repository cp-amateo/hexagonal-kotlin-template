package com.alejandromateo.hexagonal.infrastructure.adapters.inbound.api

import com.alejandromateo.hexagonal.application.CustomerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customer")
class CustomerController(
    private val customerRepository: CustomerRepository
) {

    @GetMapping("/{customerId}")
    fun getCustomer(@PathVariable("customerId") customerId: Long): String? {
        val customer = customerRepository.findById(customerId)

        return customer?.name
    }
}
