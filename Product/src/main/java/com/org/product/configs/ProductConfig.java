package com.org.product.configs;

import com.org.product.service.ProductService;
import com.org.product.service.impl.ProductServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {
    @Bean
    public ProductService getCRMService(){
        return new ProductServiceImp();
    }
}
