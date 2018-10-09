package com.springboot.controller;

import com.springboot.dao.UserDao;
import com.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    UserDao userMapper;

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello Spring boot!";
    }

    @RequestMapping("/adduser")
    public String addUser(@RequestParam(value = "name") String username,
                          @RequestParam(value = "password") String password){
        User user = new User(1,username,password);
        userMapper.saveUser(user);
        return "success!";
    }
}
