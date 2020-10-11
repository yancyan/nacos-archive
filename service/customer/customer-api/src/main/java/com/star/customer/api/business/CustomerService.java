package com.star.customer.api.business;

import com.star.customer.dto.CustomerDTO;
import com.star.partner.dto.PartnerDTO;
import org.springframework.cloud.openfeign.FeignClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

// /**
//  * @author ZhuYX
//  * @date 2020/9/28 17:07
//  */
@FeignClient(name = "customerService", path = Info.JAXRS_PATH, url = Info.URL, primary = false, contextId = "jax-rs")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
@Path("/v1/customer")
public interface CustomerService {

    @GET
    @Path("findById/{id}")
    CustomerDTO findById(@PathParam("id") Long id);

    @GET
    @Path("findPartnerById/{id}")
    PartnerDTO findPartnerById(@PathParam("id") Long id);

    @GET
    @Path("findIpAndPort")
    String getIpAndPort();
}
