package com.star.orm.api.business;

// import javax.ws.rs.Consumes;
// import javax.ws.rs.Path;
// import javax.ws.rs.Produces;
// import javax.ws.rs.core.MediaType;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author ZhuYX
 * @date 2020/10/22 15:10
 */
// @Consumes({MediaType.APPLICATION_JSON})
// @Produces({MediaType.APPLICATION_JSON})
// @Path("/v1/query")
@Slf4j
@Service
public class QueryService {

    public void query() {
        try {
            log.info("##### QueryService.query exec...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
