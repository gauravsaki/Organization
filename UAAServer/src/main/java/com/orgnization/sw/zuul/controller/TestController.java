package com.orgnization.sw.zuul.controller;

import com.orgnization.sw.zuul.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value="/test",method = RequestMethod.GET)
        public String test(){
        return "test Hello";
        }


    @Autowired
    private AccountService accountService;

    @GetMapping("/api/hello")
    public ResponseEntity<?> hello() {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        String msg = String.format("Hello %s", name);
        return new ResponseEntity<Object>(msg, HttpStatus.OK);
    }

}
