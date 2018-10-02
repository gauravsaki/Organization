package com.orgnization.sw;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.security.auth.login.AccountException;
import javax.sql.DataSource;
import java.util.Arrays;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient

public class ZuulStarter {
    public static void main(String args[]){
        SpringApplication.run(ZuulStarter.class,args);
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


}
