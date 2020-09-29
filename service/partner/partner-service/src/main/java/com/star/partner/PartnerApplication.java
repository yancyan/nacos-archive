package com.star.partner;

import com.star.common.jersey.ExMapper;
import com.star.common.jersey.RpcHeaderFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

// /**
//  * @author ZhuYX
//  * @date 2020/9/28 20:33
//  */
@EnableFeignClients(basePackages = {
        "com.star.customer.api.business"
})
@SpringBootApplication(scanBasePackages = "com.star")
public class PartnerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PartnerApplication.class).build().run(args);
    }

    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig rs = new ResourceConfig();
        rs.packages(true, "com.star.partner.api.business");
        rs.register(RpcHeaderFilter.class);
        rs.register(ExMapper.class);
        return rs;
    }
}
