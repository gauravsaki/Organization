package com.orgnization.sw.redis.user.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RedisSessionStarter {
    
    public static void main(String[] args) {
        SpringApplication.run(RedisSessionStarter.class, args);
    }
}
