package com.goods.common.goodsinfo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 商品信息
 */
@Entity
@Data
public class goods extends BaseEntity{

    /**
     * 商品Id
     */
    @Id
    @Column(name = "GoodsId")
    private Long id;

    /**
     *
     */
    private String ComName;

    /**
     * 商品名称
     */
    @Column(name = "GoodsName")
    private String name;

    @Column(name = "ImgAddrss")
    private String imgAddrss;


}
