package com.star.customer.api.business.com.star.customer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ZhuYX
 * @date 2020/9/28 17:34
 */
@EnableFeignClients
@SpringBootApplication
public class CustomerApplication {
    public static void main(String[] args) {

        new SpringApplicationBuilder(CustomerApplication.class)
                .build().run(args);
    }
}
