package com.mavis.ham.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mavis.ham.mapper.LogMapper;
import com.mavis.ham.pojo.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Jsp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LogController {
    @Autowired
    LogMapper logMapper;


    @RequestMapping("/getAllLog")
    public String getAllLog(){
        List<Log> logs = logMapper.getAllLog();
        int count = logs.size();
        //格式化JSON数据
        JSONObject res = new JSONObject();
        res.put("code",0);
        res.put("msg","");
        res.put("count",count);
        res.put("data",logs);
        return res.toJSONString();
    }

    @RequestMapping("/addLog")
    public String addLog(Log log){
        System.out.println(log);
        int i = logMapper.insert(log);
        if (i > 0){
            return "success";
        }else {
            return "fail";
        }
    }

}
