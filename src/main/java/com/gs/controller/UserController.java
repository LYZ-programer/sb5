package com.gs.controller;

import com.gs.bean.User;
import com.gs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("select")
    public String select(Model model){
        List<User> users = userService.selectAllUsers();
        model.addAttribute("users",users);
        return "dxh2";
    }

    @GetMapping("select2")
    public List<User> select2(){
        return userService.selectAllUsers();
    }
}