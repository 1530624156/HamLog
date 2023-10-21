package com.mavis.ham.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mavis.ham.pojo.Log;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LogMapper extends BaseMapper<Log> {

    @Select("select * from log;")
    List<Log> getAllLog();
}
