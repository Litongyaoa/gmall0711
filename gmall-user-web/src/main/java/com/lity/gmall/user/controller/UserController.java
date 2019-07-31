package com.lity.gmall.user.controller;

import com.lity.gmall.bean.UserInfo;
import com.lity.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/userInfoList")
    public List<UserInfo> userInfoList(){

        List<UserInfo> userInfoList = userService.userInfoList();

        return userInfoList;
    }
}
