package com.javacto.day03.b;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Test03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get请求方式");

        //请问这什么意思 ，就是访问当前类的方法    doPost();  如果加了这句，不管是get  post最终会执行  doPost方法
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //处理响映的编码格式
        resp.setContentType("text/html;charset=UTF-8");
        System.out.println("post请求方式");


        //1.获取请求参数 用户名
        String  userName = req.getParameter("userName");
        //目前前面获取的都为String 类型
        String userId = req.getParameter("userId");
        //大家一定要先判断  userId 不为空，，再转为int类型
        Integer id= Integer.parseInt(userId);

        //获取兴趣爱好， 如果是数组，必需通过getParameterValues()
        String likes[] = req.getParameterValues("likes");
        PrintWriter out = resp.getWriter();
        out.println("可以把结果响映到浏览器");
    }
    //建议大写写了   doGet()   doPost()
    /* @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //处理响映的编码格式
        resp.setContentType("text/html;charset=UTF-8");

        //1.获取请求参数 用户名
        String  userName = req.getParameter("userName");
        //目前前面获取的都为String 类型
        String userId = req.getParameter("userId");
        //大家一定要先判断  userId 不为空，，再转为int类型
        Integer id= Integer.parseInt(userId);

        //获取兴趣爱好， 如果是数组，必需通过getParameterValues()
        String likes[] = req.getParameterValues("likes");


        PrintWriter out = resp.getWriter();
        out.println("可以把结果响映到浏览器");


    }*/
}
