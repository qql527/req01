package com.javacto.day03.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class InitParamAction2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取 web.xml文件配置的初始化参数
        String encodingSbq=getInitParameter("sbq");
        /*获取Servlet上下文参数，也就是全局参数*/
        String encoding=this.getServletContext().getInitParameter("sbqEncoding");
        System.out.println(encoding);
        //处理请求的编码格式
        req.setCharacterEncoding(encodingSbq);
        //处理响映的编码格式
        resp.setContentType("text/html;charset="+encodingSbq);
        System.out.println("服务");

        PrintWriter out = resp.getWriter();
        out.println("可以把结果响映到浏览器");

        out.println(encoding);
    }
}
