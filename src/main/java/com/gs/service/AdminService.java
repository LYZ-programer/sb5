package com.gs.service;

import com.gs.bean.Admin;

public interface AdminService {
    Admin queryByUsername(String username);
}
