package com.orgnization.sw.userprofile;


import com.orgnization.sw.userprofile.models.Account;
import com.orgnization.sw.userprofile.services.AccountService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.security.auth.login.AccountException;
import javax.sql.DataSource;
import java.util.Arrays;


@SpringBootApplication
@EnableDiscoveryClient
public class UserProfileStarter {
    public static void main(String args[]){
        SpringApplication.run(UserProfileStarter.class,args);
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean @Qualifier("mainDataSource")
    public DataSource dataSource(){
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        EmbeddedDatabase db = builder
                .setType(EmbeddedDatabaseType.H2)
                .build();
        return db;
    }

   @Bean
   CommandLineRunner init(
            AccountService accountService
    ) {
        return (evt) -> Arrays.asList(
                "user,admin,john,robert,ana".split(",")).forEach(
                username -> {
                    Account acct = new Account();
                    acct.setUsername(username);
                    if ( username.equals("user")) acct.setPassword("password");
                    else acct.setPassword(passwordEncoder().encode("password"));
                    acct.setFirstName(username);
                    acct.setLastName("LastName");
                    acct.grantAuthority("ROLE_USER");
                    if ( username.equals("admin") )
                        acct.grantAuthority("ROLE_ADMIN");
                    try {
                        accountService.register(acct);
                    } catch (AccountException e) {
                        e.printStackTrace();
                    }
                }
        );
    }
}
