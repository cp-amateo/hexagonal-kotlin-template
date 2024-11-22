package com.alejandromateo.hexagonal.application

interface CustomerRepository {
    fun save(customer: Customer)
    fun findById(id: Long): Customer?
}