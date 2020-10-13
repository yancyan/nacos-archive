package com.star.common.component;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author ZhuYX
 * @date 2020/10/13 14:47
 */
@Data
@RefreshScope
@Component
public class RefreshConfigComponent {

    @Value(value = "${star.config.partner-service.test-name}")
    private String name;


}
