package service.product.configs;


import service.product.service.OrderService;
import service.product.service.impl.OrderServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {
    @Bean
    public OrderService getCRMService(){
        return new OrderServiceImp();
    }
}
