package com.shengda.hxq.mapper;

import com.shengda.hxq.pojo.User;

import java.util.List;

public interface UserMapper {

    //查询所有用户信息
    List<User> query();

    //根据id查询用户
    User findUserById(Integer id);

    //新增用户
    int insertUser(User user);

    //修改用户名字
    int updateUserNameById(Integer id,String name);

    //删除用户
    int deleteUserById(Integer id);

    //根据po修改用户
    void updateUser(User user);
}
