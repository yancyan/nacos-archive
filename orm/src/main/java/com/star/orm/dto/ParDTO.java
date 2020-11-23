package com.star.orm.dto;

import com.star.orm.common.AbstractDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ZhuYX
 * @date 2020/10/22 15:35
 */
@Getter
@Setter
@ToString
public class ParDTO extends AbstractDTO {

    private String code;
    private String name;
    private Long companyId;
    private Long saleAreaId;
    private Boolean isSetSaleArea;
    private Long levelGrade;
    private Long addressLevel;
    private Long maxSaleAddressNum;
    private String extendedAttribute;

}
