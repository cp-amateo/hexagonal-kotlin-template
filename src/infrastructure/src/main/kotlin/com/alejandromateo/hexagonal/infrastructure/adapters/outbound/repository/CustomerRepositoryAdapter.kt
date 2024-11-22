package com.alejandromateo.hexagonal.infrastructure.adapters.outbound.repository

import com.alejandromateo.hexagonal.application.Customer
import com.alejandromateo.hexagonal.application.CustomerRepository

class CustomerRepositoryAdapter: CustomerRepository {

    override fun save(customer: Customer) {}

    override fun findById(id: Long) =
        Customer(name = "Test Customer")

}