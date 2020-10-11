package com.star.customer.api.business;

import com.star.customer.dto.CustomerDTO;
import com.star.partner.api.business.PartnerService;
import com.star.partner.dto.PartnerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.stereotype.Service;

/**
 * @author ZhuYX
 * @date 2020/9/28 17:32
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService{


    @Autowired
    private PartnerService partnerService;

    @Autowired
    private Registration registration;

    @Override
    public CustomerDTO findById(Long id) {
        CustomerDTO customer = new CustomerDTO();
        customer.setName("test_name");
        customer.setAge(12);
        customer.setAddress("beijing");
        return customer;
    }

    @Override
    public PartnerDTO findPartnerById(Long id) {
        return partnerService.findById(id);
    }

    @Override
    public String getIpAndPort() {
        return registration.getHost() + registration.getPort();
    }
}
