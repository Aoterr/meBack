package com.gd.minierp.user.repository;

import com.gd.minierp.user.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * guoshuai 18-1-16
 **/
@Repository
public interface IUserRepository {

    List<User> getUsers();
}
