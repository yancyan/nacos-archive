package com.star.partner;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZhuYX
 * @date 2020/10/9 11:57
 */
@Getter
@Setter
@Slf4j
@ToString
@Configuration
public class PartnerConfig implements ApplicationContextAware, InitializingBean {

    private static ApplicationContext applicationContext;

    public static PartnerConfig getInstance() {
        return applicationContext.getBeansOfType(PartnerConfig.class).get("partnerConfig");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
