package com.star.partner;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @author ZhuYX
 * @date 2020/9/28 20:33
 */
@EnableFeignClients
@SpringBootApplication(scanBasePackages = "com.star")
public class PartnerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PartnerApplication.class).build().run(args);
    }


    @Bean
    public ResourceConfig jerseyConfig() {
        ResourceConfig config = new ResourceConfig();
        config.packages("com.star.partner.api.business");
        return config;
    }
}
