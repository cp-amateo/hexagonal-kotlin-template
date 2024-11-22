package com.alejandromateo.hexagonal.infrastructure.configuration

import com.alejandromateo.hexagonal.application.CustomerRepository
import com.alejandromateo.hexagonal.infrastructure.adapters.outbound.repository.CustomerRepositoryAdapter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class BeanConfig {

    @Bean
    open fun customerRepositoryAdapter(): CustomerRepository {
        return CustomerRepositoryAdapter()
    }
}