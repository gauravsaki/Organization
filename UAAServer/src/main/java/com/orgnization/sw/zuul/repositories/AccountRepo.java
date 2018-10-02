package com.orgnization.sw.zuul.repositories;



import com.orgnization.sw.zuul.models.Account;

import java.util.Collection;
import java.util.Optional;
//extends Repository<Account, Long>
public interface AccountRepo  {

    Collection<Account> findAll();
    Optional<Account> findByUsername(String username);
    Optional<Account> findById(Long id);
    Integer countByUsername(String username);
    Account save(Account account);
    void deleteAccountById(Long id);



}
