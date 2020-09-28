package com.star.partner.api.fallback;

import com.star.partner.api.business.PartnerService;
import com.star.partner.dto.PartnerDTO;

public class PartnerBack implements PartnerService {


    @Override
    public PartnerDTO findById(Long id) {
        return null;
    }
}
