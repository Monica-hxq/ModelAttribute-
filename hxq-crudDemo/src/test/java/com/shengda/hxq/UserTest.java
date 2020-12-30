package com.shengda.hxq;

import com.shengda.hxq.pojo.User;
import com.shengda.hxq.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UsersService usersService;

    @Test
    public void findUser(){
        List<User> users = usersService.query();
        for (User user:users){
            System.out.println(user);
        }
    }

    @Test
    public void findUserById(){
        User user = usersService.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void insertUser(){
        User user = new User();
        user.setName("李四");
        user.setAge(22);
        usersService.insertUser(user);
    }

    @Test
    public void updateUserNameById(){

        usersService.updateUserNameById(1,"王五");
    }

    @Test
    public void deleteUserById(){
        usersService.deleteUserById(3);
    }
}
