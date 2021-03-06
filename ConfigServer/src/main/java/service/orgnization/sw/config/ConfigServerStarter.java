package service.orgnization.sw.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigServerStarter {
    public static void main(String[] args) {
        String [] newArgs = {};
        SpringApplication.run(ConfigServerStarter.class, newArgs);
    }
}
