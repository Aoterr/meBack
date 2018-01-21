package com.gd.minierp.product.repository;

import com.gd.minierp.product.bean.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IProductMapperTest {


    @Autowired
    IProductMapper IProductMapper;

    @Test
    public void getOne() {
        IProductMapper.queryById(1);
    }  
    @Test
    public void getAll() {
        List<Product> product = IProductMapper.queryAllProducts();
    }
}