package com.lity.gmall.service;

import com.lity.gmall.bean.UserInfo;

import java.util.List;

public interface UserService {
    List<UserInfo> userInfoList();
    int insertUser(UserInfo userInfo);
    int modifyUser(UserInfo userInfo);
    int deletUserById(String id);

}
