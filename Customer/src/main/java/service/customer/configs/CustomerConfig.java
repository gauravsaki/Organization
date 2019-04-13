package service.customer.configs;

import service.customer.service.impl.CustomerServiceImp;
import service.customer.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
    @Bean
    public CustomerService getCRMService(){
        return new CustomerServiceImp();
    }
}
