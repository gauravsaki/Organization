package com.org.api.gateway.controllers;

import com.org.api.gateway.repository.CustomerRepo;
import com.org.api.gateway.repository.ProductRepo;
import com.org.api.gateway.view.CustomerProductView;
import com.orgnization.sw.pojo.Customer;
import com.orgnization.sw.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
