package com.gd.minierp.user.repository;


import com.gd.minierp.user.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IUserMapperTest {


    @Autowired
    IUserMapper userMapper;

    @Test
    public void getOne() {
        User user = userMapper.selectByPrimaryKey(1);
    }

    @Test
    public void insertOne() {

        User user = new User();
        user.setPassword("sfsf");
        user.setPhone("123323");
        userMapper.insert(user);
    }
}