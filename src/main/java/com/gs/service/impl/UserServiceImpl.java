package com.gs.service.impl;

import com.gs.bean.User;
import com.gs.mapper.UserMapper;
import com.gs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Cacheable("selectAllUsers")
    //value属性值表示缓存中的key值，缓存中的value值为方法返回值
    public List<User> selectAllUsers() {
        System.out.println("service方法");
        return userMapper.selectAll();
    }

    @Cacheable("selectAllUsers")
    public List<User> selectAllUsers2() {
        System.out.println("service方法");
        return new ArrayList<>();
    }
}