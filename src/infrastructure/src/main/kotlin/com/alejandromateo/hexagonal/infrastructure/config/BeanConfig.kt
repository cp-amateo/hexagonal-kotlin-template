package com.alejandromateo.hexagonal.infrastructure.config

import com.alejandromateo.hexagonal.application.CustomerRepository
import com.alejandromateo.hexagonal.infrastructure.repository.CustomerRepositoryAdapter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class BeanConfig {

    @Bean
    open fun customerRepositoryAdapter(): CustomerRepository {
        return CustomerRepositoryAdapter()
    }
}