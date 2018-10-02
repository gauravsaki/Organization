package com.orgnization.sw.userprofile.controller;


import com.orgnization.sw.userprofile.models.Account;
import com.orgnization.sw.userprofile.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserProfileController {


    @RequestMapping(value="/test",method = RequestMethod.GET)
        public String test(){
        return "test Hello";
        }


    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/api/userprofile/getUserProfile",produces= MediaType.APPLICATION_JSON_VALUE)
    public Account getUserProfile(@RequestParam(value="username", defaultValue="user") String username) {
        Account account =accountService.findAccountByUsername(username);
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        String msg = String.format("Hello %s", name);
        System.out.println("Account +"+account.toString());
        return account;
       // return new ResponseEntity<Object>(account, HttpStatus.OK);
    }

}
