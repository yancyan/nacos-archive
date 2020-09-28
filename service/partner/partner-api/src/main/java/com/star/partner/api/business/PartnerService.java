package com.star.partner.api.business;

import com.star.partner.api.fallback.PartnerBack;
import com.star.partner.dto.PartnerDTO;
import org.springframework.cloud.openfeign.FeignClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * @author ZhuYX
 * @date 2020/9/28 20:32
 */
@Path("partner-service")
@FeignClient(name = "partnerService", url = Info.url, fallback = PartnerBack.class)
public interface PartnerService {

    @GET
    @Path("findById")
    PartnerDTO findById(@QueryParam("id") Long id);

}
