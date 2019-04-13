package com.orgnization.sw.staticweb.service.repository;

import service.orgnization.sw.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductRepo {
    @Autowired
    RestTemplate restTemplate;
    public Product getProducts(int custId){
        return restTemplate.getForObject("http://zuulapigateway/product/api/getProduct?id="+custId, Product.class);

    }
}
