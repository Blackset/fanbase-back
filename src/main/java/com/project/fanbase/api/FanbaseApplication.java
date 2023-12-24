package com.project.fanbase.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.project.fanbase.api" })
@EnableJpaRepositories(basePackages = { "com.project.fanbase.api" })
@Configuration
public class FanbaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanbaseApplication.class, args);
    }

}
