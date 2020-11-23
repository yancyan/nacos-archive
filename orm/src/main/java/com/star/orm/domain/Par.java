package com.star.orm.domain;

import com.star.orm.common.AbstractModal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author ZhuYX
 * @date 2020/10/22 15:34
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "PARTNER_LEVEL")
public class Par extends AbstractModal {

    @Id
    @SequenceGenerator(name = "PARTNER_LEVEL_ID_GENERATOR", sequenceName = "SEQ_PARTNER_LEVEL", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PARTNER_LEVEL_ID_GENERATOR")
    private Long id;

    private String code;
    private String name;

    @Column(name = "COMPANY_ID")
    private Long companyId;

    @Column(name = "sale_area_id")
    private Long saleAreaId;

    /**
     * 是否需要设置销售区域
     */
    @Column(name = "IS_SET_SALE_AREA")
    private Boolean isSetSaleArea;

    /**
     * 级别等级
     */
    @Column(name = "LEVEL_GRADE")
    private Long levelGrade;

    /**
     * 销售地址层级
     */
    @Column(name = "ADDRESS_LEVEL")
    private Long addressLevel;

    /**
     * 销售地址的最多个数
     */
    @Column(name = "MAX_SALE_ADDRESS_NUM")
    private Long maxSaleAddressNum;

    /**
     * 扩展属性
     */
    @Column(name = "EXTENDED_ATTRIBUTE")
    private String extendedAttribute;




}
