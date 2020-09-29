package com.star.common.jersey;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.http.HttpStatus;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * @author ZhuYX
 * @date 2020/9/29 16:57
 */
@Slf4j
public class ExMapper implements ExceptionMapper<Throwable> , ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public Response toResponse(Throwable ex) {
        log.error("##########" + ex.getMessage(), ex);
        return Response.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).entity(
                EntityObject.builder().code(ex.getLocalizedMessage()).message(ex.getMessage())
                        .build()).type(MediaType.APPLICATION_JSON).build();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Builder
    @Getter
    @Setter
    @ToString
    static class EntityObject{
        String code;
        String message;
    }
}
