package com.gs.service.impl;

import com.gs.bean.Admin;
import com.gs.mapper.AdminMapper;
import com.gs.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin queryByUsername(String username) {
        return adminMapper.queryByUsername(username);
    }
}