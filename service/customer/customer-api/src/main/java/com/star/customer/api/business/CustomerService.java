package com.star.customer.api.business;

import com.star.customer.api.fallback.CustomerBack;
import com.star.customer.dto.CustomerDTO;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author ZhuYX
 * @date 2020/9/28 17:07
 */
@FeignClient(name = "customerService", url = Info.url, fallback = CustomerBack.class)
public interface CustomerService {

    CustomerDTO findById(Long id);

}
