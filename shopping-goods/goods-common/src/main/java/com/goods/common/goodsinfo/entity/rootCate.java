package com.goods.common.goodsinfo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class rootCate {

    @Id
    @Column(name = "rootCateId")
    private long id;

    @Column(name = "rootCateCode")
    private String code;

    @Column(name = "rootCateName")
    private String name;
}
