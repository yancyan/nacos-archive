package com.star.partner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZhuYX
 * @date 2020/10/9 11:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Configuration
@ConfigurationProperties(prefix = "star.config.partner-service", ignoreInvalidFields = true)
public class PartnerConfig implements ApplicationContextAware, InitializingBean {

    @ToStringExclude
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

    public String getPrintString() {
        return toString();
    }

    /**
     * 测试系统配置
     */
    private Boolean test;

    private String testName;

}
