package com.star.orm.aop;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ZhuYX
 * @date 2020/10/29 16:31
 */
@Setter
@Getter
@ToString
public class TestDTO {
    private String code;

    public TestDTO(String code) {
        this.code = code;
    }
}
