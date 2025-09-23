package com.mytests.spring.springapiversioninghttpclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.service.registry.ImportHttpServices;

@SpringBootApplication
// not necessary if explicit configuration is used:
@ImportHttpServices(SomeClient.class)
public class SpringApiversioningHttpclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringApiversioningHttpclientApplication.class, args);
    }
    @Bean
        public CommandLineRunner commandLineRunner(SomeClient someClient) {
            return args -> {
                System.out.println("--------------------------------------");
                System.out.println(someClient.test100());
                System.out.println(someClient.test111());
                System.out.println(someClient.test12plus());
                System.out.println(someClient.testNoExplicitVersion());
                System.out.println("--------------------------------------");
            };
        }
}
