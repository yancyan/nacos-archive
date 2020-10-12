package com.star.customer;

import com.star.common.jersey.ExMapper;
import com.star.common.jersey.RpcHeaderFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@EnableFeignClients(basePackages = {
        "com.star.partner.api.business"
})
@EnableDiscoveryClient
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
        rs.register(RpcHeaderFilter.class);
        rs.register(ExMapper.class);
        return rs;
    }


    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .setConnectTimeout(Duration.ofMinutes(1))
                .setReadTimeout(Duration.ofMinutes(1))
                .build();
    }
}