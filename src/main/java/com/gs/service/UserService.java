package com.gs.service;

import com.gs.bean.User;

import java.util.List;

public interface UserService {
    List<User> selectAllUsers();
    List<User> selectAllUsers2();
}
