package com.orgnization.sw.staticweb.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StaticWebServiceStarter {

    public static void main(String args[]) throws Exception{
        SpringApplication.run(StaticWebServiceStarter.class,args);
    }

}
