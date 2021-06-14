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

@WebServlet("/findUserById.do")
public class FindUserByIdAction extends HttpServlet  {
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
        String strId= req.getParameter("id");
        Integer id = Integer.parseInt(strId);

        //2.创建业务层代码
        UserService userService=new UserServiceImpl();
        //3.调用查询所有方法
        User user=userService.findUserById(id);

        //3.把结果存在HttpServletRequest 对象中
        req.setAttribute("user",user);
        //4.跳转到jsp
        req.getRequestDispatcher("/updateUser.jsp").forward(req,resp);
    }
}
