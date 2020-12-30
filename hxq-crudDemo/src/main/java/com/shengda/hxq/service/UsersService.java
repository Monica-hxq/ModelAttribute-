package com.shengda.hxq.service;

import com.shengda.hxq.mapper.UserMapper;
import com.shengda.hxq.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UserMapper userMapper;

    //查询所有用户信息
    public List<User> query(){
        return userMapper.query();
    }

    //根据id查询用户
    public User findUserById(Integer id){
        return userMapper.findUserById(id);
    }

    //插入用户
    public int insertUser(User user){
        return userMapper.insertUser(user);
    }

    //修改用户
    public int updateUserNameById(Integer id,String name){
        return userMapper.updateUserNameById(id,name);
    }

    //删除用户
    public int deleteUserById(Integer id){
        return userMapper.deleteUserById(id);
    }

    //通过po修改用户
    public void updateUser(User user) {
         userMapper.updateUser(user);
    }
}
