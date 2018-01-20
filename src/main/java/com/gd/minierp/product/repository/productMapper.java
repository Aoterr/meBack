package com.gd.minierp.product.repository;

import com.gd.minierp.product.bean.product;

public interface productMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(product record);

    int insertSelective(product record);

    product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(product record);

    int updateByPrimaryKeyWithBLOBs(product record);

    int updateByPrimaryKey(product record);
}