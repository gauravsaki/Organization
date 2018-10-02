package com.org.product.service.impl;


import com.org.product.service.ProductService;
import com.orgnization.sw.pojo.Product;

import javax.annotation.PreDestroy;

public class ProductServiceImp implements ProductService {

    @Override
    public Product getProduct(int prodId) {
        Product product = new Product();
        product.setName("Tv");
        product.setPrice(4556.8f);
        return product;
    }
}
