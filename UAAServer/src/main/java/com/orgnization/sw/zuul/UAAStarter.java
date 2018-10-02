package com.orgnization.sw.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
@EnableDiscoveryClient
public class UAAStarter {
    public static void main(String args[]){
        SpringApplication.run(UAAStarter.class,args);
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

   /* @Bean @Qualifier("mainDataSource")
    public DataSource dataSource(){
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        EmbeddedDatabase db = builder
                .setType(EmbeddedDatabaseType.H2)
                .build();
        return db;
    }*/

/*   @Bean
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
    }*/
}
