package com.gd.minierp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@MapperScan("com.gd.minierp.user.repository")
@EnableTransactionManagement
public class MinierpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinierpApplication.class, args);
    }
}
