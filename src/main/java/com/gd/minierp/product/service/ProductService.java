package com.gd.minierp.product.service;

import com.gd.minierp.product.bean.Product;

import java.util.List;

public interface ProductService {

    List<Product> queryProductPagination();
}
