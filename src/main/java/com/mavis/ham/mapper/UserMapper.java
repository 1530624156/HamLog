package com.mavis.ham.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mavis.ham.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where username = #{username} and password = #{password};")
    List<User> getUser(@Param("username") String username,@Param("password") String password);
}
