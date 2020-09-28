package com.star.partner.api.business;

import com.star.partner.dto.PartnerDTO;
import org.springframework.stereotype.Service;

/**
 * @author ZhuYX
 * @date 2020/9/28 20:32
 */
@Service("partnerService")
public class PartnerServiceImpl implements PartnerService{


    @Override
    public PartnerDTO findById(Long id) {
        PartnerDTO p  = new PartnerDTO();
        p.setName("p_name");
        p.setAge(10);
        p.setAddress("p_address");
        return p;
    }
}
