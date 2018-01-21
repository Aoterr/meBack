package com.gd.minierp.product.controller;


import com.gd.minierp.product.bean.Product;
import com.gd.minierp.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {


    @Autowired
    ProductService productService;

    @GetMapping("queryAll")
    public List<Product> queryProductsPagination(){
        return productService.queryProductPagination();
    }

}
