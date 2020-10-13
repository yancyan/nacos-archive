package com.star.partner.api.business;

import com.star.common.component.RefreshConfigComponent;
import com.star.partner.PartnerConfig;
import com.star.partner.dto.PartnerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.stereotype.Service;

/**
 * @author ZhuYX
 * @date 2020/9/28 20:32
 */
@Slf4j
@Service("partnerService")
public class PartnerServiceImpl implements PartnerService{


    @Autowired
    private Registration registration;

    // @Value(value = "${star.config.partner-service.test-name}")
    // private String name;
    @Autowired
    RefreshConfigComponent rcc;

    @Override
    public PartnerDTO findById(Long id) {
        PartnerDTO p  = new PartnerDTO();
        p.setName("p_name");
        p.setAge(10);
        p.setAddress("p_address");
        return p;
    }

    @Override
    public String getIpAndPort() {
        return registration.getHost() + registration.getPort();
    }

    @Override
    public String getConfigs() {
        return PartnerConfig.getInstance().getPrintString() + "####### name " + rcc.getName();
    }

}
