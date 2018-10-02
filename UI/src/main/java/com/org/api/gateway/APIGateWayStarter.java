package com.org.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class APIGateWayStarter{

    public static void main(String args[]) throws Exception{
        SpringApplication.run(APIGateWayStarter.class,args);
    }

}
