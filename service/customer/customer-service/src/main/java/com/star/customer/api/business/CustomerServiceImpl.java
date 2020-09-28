package com.star.customer.api.business;

import com.star.customer.dto.CustomerDTO;
import org.springframework.stereotype.Service;

/**
 * @author ZhuYX
 * @date 2020/9/28 17:32
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDTO findById(Long id) {
        CustomerDTO customer = new CustomerDTO();
        customer.setName("test_name");
        customer.setAge(12);
        customer.setAddress("beijing");
        return customer;
    }
}
