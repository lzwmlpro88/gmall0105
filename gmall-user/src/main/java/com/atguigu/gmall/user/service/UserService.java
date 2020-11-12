package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;

import java.util.List;

/**
 * 用户接口
 * @author: longzhangwei
 * @create: 2020-10-27-14:00
 */
public interface UserService {

    /**
     * 查询所有的用户
     * @return
     */
    public List<UmsMember> getAllUser();
}
