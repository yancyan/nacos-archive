package com.star.orm.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;

/**
 * @author ZhuYX
 * @date 2020/10/22 15:36
 */
@Getter
@Setter
@ToString
public class AbstractDTO implements Serializable {

    private Long id;

    private int version;
    private Long createId;
    private Instant createInstant;
    private Long modifyId;
    private Instant modifyInstant;
    private String transactionId;
    private String serverName;


}
