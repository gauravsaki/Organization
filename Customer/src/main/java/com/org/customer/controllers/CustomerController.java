package com.org.customer.controllers;


import com.org.customer.service.CustomerService;
import com.orgnization.sw.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerService crmService;
    @RequestMapping(value = "/api/getCustomer",method = RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
    public Customer getCustomer(@RequestParam(value="id", defaultValue="1") int id){
       return crmService.getCustomer(id);
    }
}
