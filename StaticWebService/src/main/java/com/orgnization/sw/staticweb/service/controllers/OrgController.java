package com.orgnization.sw.staticweb.service.controllers;

import com.orgnization.sw.staticweb.service.repository.CustomerRepo;
import com.orgnization.sw.staticweb.service.repository.ProductRepo;
import com.orgnization.sw.staticweb.service.view.CustomerProductView;
import service.orgnization.sw.pojo.Customer;
import service.orgnization.sw.pojo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class OrgController {
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    ProductRepo productRepo;
    @RequestMapping(value = "/api/getCus&ProdDetails",method = RequestMethod.GET)
    public CustomerProductView getCustProdDetails(@RequestParam(value = "custId") int custId){
        Customer customer = customerRepo.getCustomer(custId);
        Product product = productRepo.getProducts(custId);
        CustomerProductView customerProductView = new CustomerProductView();
        customerProductView.setCusName(customer.getName());
        customerProductView.setCusPincode(customer.getPinCode());
        customerProductView.setProName(product.getName());
        customerProductView.setPrdPrice(product.getPrice());
       return customerProductView;
    }
}
