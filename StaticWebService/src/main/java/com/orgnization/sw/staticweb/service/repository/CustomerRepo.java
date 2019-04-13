package com.orgnization.sw.staticweb.service.repository;

import service.orgnization.sw.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CustomerRepo {
    @Autowired
    RestTemplate restTemplate;
    public Customer getCustomer(int id){
        return restTemplate.getForObject("http://zuulapigateway/customer/api/getCustomer?id="+id, Customer.class);

    }
}
