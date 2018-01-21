package com.gd.minierp.product.service.impl;

import com.gd.minierp.product.bean.Product;
import com.gd.minierp.product.repository.IProductMapper;
import com.gd.minierp.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    IProductMapper productMapper;

    @Override
    public List<Product> queryProductPagination() {
        return productMapper.queryAllProducts();
    }
}
