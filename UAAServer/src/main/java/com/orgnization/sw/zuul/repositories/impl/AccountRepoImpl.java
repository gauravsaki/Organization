package com.orgnization.sw.zuul.repositories.impl;



import com.orgnization.sw.zuul.models.Account;
import com.orgnization.sw.zuul.models.DemoAccount;
import com.orgnization.sw.zuul.repositories.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

//extends Repository<Account, Long>
public class AccountRepoImpl implements AccountRepo {
    final String  URL ="http://userprofile/api/userprofile/getUserProfile?username=user";

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Collection<Account> findAll() {
        return (Collection<Account>)restTemplate.getForObject(URL, Account.class);

    }

    @Override
    public Optional<Account> findByUsername(String username) {
        DemoAccount account =restTemplate.getForObject(URL, DemoAccount.class);
        System.out.println("Accout in UAAserver : "+account.toString());
        Account account1 = new Account();
        account1.setUsername(account.getUsername());
        account1.setPassword(account.getPassword());
        account1.setFirstName(account.getFirstName());
        account1.setLastName(account.getLastName());
        account1.setId(Long.getLong(account.getId()+""));
        account1.setEmail(account.getEmail());
        account1.setAccountNonExpired(true);
        account1.setCredentialsNonExpired(true);
        account1.setAccountNonLocked(true);
        account1.setRoles(Arrays.asList("ROLE_USER]"));
        account1.setEnabled(true);
        Optional<Account> accountOptional = Optional.of(account1);
        return accountOptional;

    }

    @Override
    public Optional<Account> findById(Long id) {
        return null;
    }

    @Override
    public Integer countByUsername(String username) {
        return null;
    }

    @Override
    public Account save(Account account) {
        return null;
    }

    @Override
    public void deleteAccountById(Long id) {

    }
}
