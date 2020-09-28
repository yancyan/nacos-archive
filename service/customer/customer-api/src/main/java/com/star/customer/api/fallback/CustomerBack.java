package com.star.customer.api.fallback;

import com.star.customer.api.business.CustomerService;
import com.star.customer.dto.CustomerDTO;

public class CustomerBack implements CustomerService {

    @Override
    public CustomerDTO findById(Long id) {
        return null;
    }
}
