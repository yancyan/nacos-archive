package com.star.customer;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(scanBasePackages = "com.star")
public class CustomerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(CustomerApplication.class).build().run(args);
    }

    @Bean
    public ResourceConfig jerseyConfig() {
        ResourceConfig config = new ResourceConfig();
        config.packages("com.star.customer.api.business");
        return config;
    }
}