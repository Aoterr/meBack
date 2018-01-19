package com.gd.minierp.user.repository;

import com.gd.minierp.user.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * guoshuai 18-1-16
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRespositoryTest {

    @Autowired
    IUserRepository userMapper;

    @Test
    public void testInsertUser() {
    }
}