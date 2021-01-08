package com.clin.mybatis.demo.controller;

import com.clin.mybatis.demo.dao.UserDAO;
import com.clin.mybatis.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @GetMapping("/info")
    public User getUser(@RequestParam Long id) {
        return userDAO.findById(id);
    }
}
