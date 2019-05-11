package com.holestic.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.holestic")
@EnableMongoRepositories("com.holestic.repository")
public class Application {

    public static void main(String a[]) {
        SpringApplication.run(Application.class,a);
    }
}
