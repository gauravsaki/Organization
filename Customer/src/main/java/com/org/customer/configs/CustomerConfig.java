package com.org.customer.configs;

import com.org.customer.service.CustomerService;
import com.org.customer.service.impl.CustomerServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
    @Bean
    public CustomerService getCRMService(){
        return new CustomerServiceImp();
    }
}
