package com.mavis.ham.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//我的session工具，用于临时存储数据

@RestController
public class GetSession{

    @RequestMapping("/GetSession")
    protected void GetSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key = req.getParameter("key");
        String data = (String) req.getSession().getAttribute(key);
        writeToPage(resp,data);
    }




    /**
     * 写数据到响应中
     * @param resp
     * @param data
     */
    protected void writeToPage(HttpServletResponse resp,String data){
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = null;
        try {
            writer = resp.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.print(data);
        writer.flush();
        writer.close();
    }
}
