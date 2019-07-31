package com.lity.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lity.gmall.bean.UserInfo;
import com.lity.gmall.service.UserService;
import com.lity.gmall.user.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserInfo> userInfoList() {

        return userMapper.selectAll();
    }

    @Override
    public int insertUser(UserInfo userInfo) {

        return userMapper.insert(userInfo);
    }

    @Override
    public int modifyUser(UserInfo userInfo) {

        return userMapper.updateByPrimaryKey(userInfo);
    }

    @Override
    public int deletUserById(String id) {
        return userMapper.deleteByPrimaryKey(id);
    }
}
