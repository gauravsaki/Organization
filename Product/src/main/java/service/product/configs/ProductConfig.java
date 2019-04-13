package service.product.configs;

import service.product.service.ProductService;
import service.product.service.impl.ProductServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {
    @Bean
    public ProductService getCRMService(){
        return new ProductServiceImp();
    }
}
