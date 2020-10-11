package com.star.partner.api.business;

import com.star.partner.dto.PartnerDTO;
import org.springframework.cloud.openfeign.FeignClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author ZhuYX
 * @date 2020/9/28 20:32
 */
@FeignClient(name = "partnerService", path = Info.JAXRS_PATH, url = Info.URL, primary = false, contextId = "jax-rs")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
@Path("/v1/partner")
public interface PartnerService {

    @GET
    @Path("findById/{id}")
    PartnerDTO findById(@PathParam("id") Long id);


    @GET
    @Path("findIpAndPort")
    String getIpAndPort();
}
