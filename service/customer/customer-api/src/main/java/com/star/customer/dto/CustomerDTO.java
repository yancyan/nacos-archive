package com.star.customer.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class CustomerDTO implements Serializable {
    private Long id;
    private String name;
    private String address;
    private Integer age;

}
