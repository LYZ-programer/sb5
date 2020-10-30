package com.gs.mapper;

import com.gs.bean.Admin;
import org.apache.ibatis.annotations.Select;

public interface AdminMapper {

    @Select("select * from t_user where username=#{username}")
    Admin queryByUsername(String username);
}
