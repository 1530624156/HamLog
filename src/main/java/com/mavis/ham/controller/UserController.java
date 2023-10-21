package com.mavis.ham.controller;

import com.mavis.ham.mapper.UserMapper;
import com.mavis.ham.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/login")
    public String loginUser(HttpServletRequest req,String username, String password){
        List<User> users = userMapper.getUser(username, password);
        if (users.size() > 0){
            HttpSession session = req.getSession();
            session.setAttribute("radio",users.get(0).getRadio());
            return users.get(0).toString();

        }else{
            return "fail";
        }
    }

    @RequestMapping("/logout")
    public String logoutUser(HttpServletRequest req){
        HttpSession session = req.getSession();
        session.removeAttribute("radio");
        return "success!";
    }
}
