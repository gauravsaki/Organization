package com.org.product.configs;


import com.org.product.service.OrderService;
import com.org.product.service.impl.OrderServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {
    @Bean
    public OrderService getCRMService(){
        return new OrderServiceImp();
    }
}
