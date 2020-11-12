package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务层实现类
 * @author: longzhangwei
 * @create: 2020-10-27-14:01
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    /**
     * 查询所有的用户
     *
     * @return
     */
    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAll();
    }
}
