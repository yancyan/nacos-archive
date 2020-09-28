package com.star.partner.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class PartnerDTO implements Serializable {
    private Long id;
    private String name;
    private String address;
    private Integer age;

}
