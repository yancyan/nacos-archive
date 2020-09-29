package com.star.common.jersey;

import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;

/**
 * @author ZhuYX
 * @date 2020/9/29 16:49
 */
@Slf4j
public class RpcHeaderFilter implements ContainerRequestFilter, ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext requestContext) {
        log.info("########### request filter log info.");
        requestContext.getHeaders().forEach((k,v) -> log.info("header is " + k + ": " + v));
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) {
        log.info("############# responseContext filter log info.");
        responseContext.getHeaders().forEach((k,v) -> log.info("header is " + k + ": " + v));
    }
}
