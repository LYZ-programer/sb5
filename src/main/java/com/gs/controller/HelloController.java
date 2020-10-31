package com.gs.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping({"/","/index","index.html"})
    public String toIndex(Model model){
        model.addAttribute("msg","hello world");
        return "index";
    }

    @RequestMapping("/user/add")
    public String add(Model model){
        model.addAttribute("msg","这是添加页面");
        return "user/add";
    }

    @RequestMapping("/user/update")
    public String update(Model model){
        model.addAttribute("msg","这是更新页面");
        return "user/update";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(String username,String password,Model model){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        try {
            subject.login(token);
            return "index";
        }catch (UnknownAccountException e){
            model.addAttribute("msg","账号不存在");
            return "login";
        }catch (IncorrectCredentialsException e){
            model.addAttribute("msg","密码错误");
            return "login";
        }
    }

    @RequestMapping("/una")
    @ResponseBody
    public String una(){
        return "未授权的用户";
    }
}