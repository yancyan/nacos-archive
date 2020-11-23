package com.star;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author ZhuYX
 * @date 2020/10/22 15:07
 */
@EntityScan("com.star.orm.domain")
@EnableJpaRepositories(basePackages = "com.star.orm.dao")
@SpringBootApplication(scanBasePackages = "com.star")
public class OrmApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(OrmApplication.class)
                .build()
                .run(args);
    }

}
