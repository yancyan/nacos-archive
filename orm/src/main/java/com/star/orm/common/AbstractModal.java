package com.star.orm.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Version;
import java.time.Instant;

/**
 * @author ZhuYX
 * @date 2020/10/22 15:36
 */
@Getter
@Setter
@ToString
public class AbstractModal {

    @Version
    private int version;

    @Column(name = "CREATE_ID", updatable = false)
    private Long createId;

    @Column(name = "CREATE_INSTANT", updatable = false)
    private Instant createInstant;

    @Column(name = "MODIFY_ID")
    private Long modifyId;

    @Column(name = "MODIFY_INSTANT")
    private Instant modifyInstant;

    @Column(name = "TRANSACTION_ID")
    private String transactionId;

    @Column(name = "SERVER_NAME")
    private String serverName;


}
