package com.star.customer;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@EnableFeignClients(basePackages = {
        "com.star.partner.api.business"
})
@SpringBootApplication(scanBasePackages = "com.star")
public class CustomerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(CustomerApplication.class).build().run(args);
    }

    @Bean
    public ResourceConfig resourceConfig(ApplicationContext ac) {
        ResourceConfig rs = new ResourceConfig();
        rs.packages(true, "com.star.customer.api.business");
        // rs.registerClasses(JerseyServiceAutoScanner.getPublishJerseyServiceClasses(ac, "com.star.customer.api.business"));
        return rs;
    }
}