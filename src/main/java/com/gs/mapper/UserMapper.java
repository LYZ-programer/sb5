package com.gs.mapper;

import com.gs.bean.User;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {
//    @Select("select * from t_test")
//    List<User> selectAllUsers();
}
