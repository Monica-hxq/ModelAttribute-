package com.shengda.hxq.controller;

import com.shengda.hxq.pojo.User;
import com.shengda.hxq.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/anno")
public class MvcAnnoController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("index")
    public String index(Model model){
        User user = usersService.findUserById(2);
        model.addAttribute("user",user);
        return "test";
    }

    /*@ModelAttribute
    public User getUser(Integer id){
        User user = usersService.findUserById(id);
        System.out.println("【先执行】根据id从数据库中查出的user"+user);
        return user;
    }*/

    @ModelAttribute
    public void getUser(Integer id, Map map){
        User user = usersService.findUserById(id);
        System.out.println("【先执行】根据id从数据库中查出的user"+user);
        map.put("abc",user);
        return;

    }

    @RequestMapping(value = "/testModelAttribute",method = RequestMethod.POST)
    public String testModelAttribute(@ModelAttribute("abc") User user){

        usersService.updateUser(user);
        System.out.println("【后执行】修改后"+ user);
        return "success";

    }
}
