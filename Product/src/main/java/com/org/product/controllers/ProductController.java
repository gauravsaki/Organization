package com.org.product.controllers;


import com.org.product.service.ProductService;
import com.orgnization.sw.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping(value = "/api/getProduct",method = RequestMethod.GET)
    public Product getCustomer(@RequestParam(value="id", defaultValue="1") int id){
       return productService.getProduct(id);
    }
}
