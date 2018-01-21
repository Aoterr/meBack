package com.gd.minierp.product.repository;

import com.gd.minierp.product.bean.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product queryById(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKeyWithBLOBs(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> queryAllProducts();
}