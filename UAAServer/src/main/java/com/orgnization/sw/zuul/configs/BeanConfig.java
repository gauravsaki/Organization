package com.orgnization.sw.zuul.configs;


import com.orgnization.sw.zuul.repositories.AccountRepo;
import com.orgnization.sw.zuul.repositories.impl.AccountRepoImpl;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getTemplate(){
        return new RestTemplate();
    }

    @Bean
    public AccountRepo getAccountRepo(){
        return new AccountRepoImpl();
    }

}
