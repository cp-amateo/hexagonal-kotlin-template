package com.alejandromateo.hexagonal.infrastructure.adapters.inbound.api

import assertk.assertThat
import assertk.assertions.isEqualTo
import com.alejandromateo.hexagonal.application.Customer
import com.alejandromateo.hexagonal.application.CustomerRepository
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory

class CustomerControllerTest {
    private val customerRepository: CustomerRepository = mockk<CustomerRepository>()

    private val customerController = CustomerController(customerRepository)


    companion object {
        private const val CUSTOMER_NAME = "fake-name"
    }

    @Test
    fun `should return customer name when calling get customer`() {
        every { customerRepository.findById(any()) }.returns(Customer(name = CUSTOMER_NAME))

        val customerName = customerController.getCustomer(1)

        assertThat(customerName).isEqualTo(CUSTOMER_NAME)
    }

    @TestFactory
    fun `should return customer name when calling get customer with`() = listOf(
        Pair(1L, "NAME_1"),
        Pair(2L, "NAME_2"),
    ).map { (customerId, expectedCustomerName) ->
        DynamicTest.dynamicTest("customerId:$customerId name:$expectedCustomerName") {
            every { customerRepository.findById(customerId) }.returns(Customer(name = expectedCustomerName))

            val customerName = customerController.getCustomer(customerId)
            assertThat(expectedCustomerName).isEqualTo(customerName)
        }
    }
}