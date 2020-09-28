package com.star.partner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author ZhuYX
 * @date 2020/9/28 20:33
 */
@SpringBootApplication
public class PartnerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PartnerApplication.class).build().run(args);
    }
}
