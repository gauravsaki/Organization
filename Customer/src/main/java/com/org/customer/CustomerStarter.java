package com.org.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerStarter {
    public static void main(String args[]) throws Exception{
        SpringApplication.run(CustomerStarter.class,args);
    }
}
