package com.javacto.action;

import com.javacto.po.User;
import com.javacto.service.UserService;
import com.javacto.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addUser.do")
public class AddUserAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求编码格式
        req.setCharacterEncoding("UTF-8");
        //处理响映编码格式
        resp.setContentType("text/html;charset=UTF-8");

        //1.获取请求参数
        String userName=req.getParameter("userName");
        String sex=req.getParameter("sex");
        String pwd=req.getParameter("pwd");
        String address=req.getParameter("address");

        //2.把前端页面获取的结果存入User对象中
        User user=new User();
        user.setUserName(userName);
        user.setSex(sex);
        user.setPwd(pwd);
        user.setAddress(address);

        //2.创建业务层代码
        UserService userService=new UserServiceImpl();
        //3.调用查询所有方法
        userService.addUser(user);
        //4.跳转到jsp
        req.getRequestDispatcher("/pageQueryUser.do").forward(req,resp);
    }
}
