package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 用户控制器
 * @author: longzhangwei
 * @create: 2020-10-27-14:00
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        return userService.getAllUser();
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @PostMapping("/saveUser")
    @ResponseBody
    public String saveUser(UmsMember user){
        System.out.println(user);
        return "ok";
    }


}
