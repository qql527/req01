package com.javacto.day03.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * describe
 * 使用Servlet 我们有自己手动new对象吗  ？  实例化的意思      这个步骤是由  Servlet 容器给我们创建
 *  Servlet 容器给我们创建 对象，那什么时候创建?  1
 * 作者：曾昭武  adam8831
 */
public class ServletInitDestroy extends HttpServlet {
    @Override
    public void init() throws ServletException {
        //初始化
        System.out.println("init 方法,只要对象实例化后，就马上会执行的2");
        //请问这一句话是什么时候执行的，是tomcat启动就执行，还是 访问这个url才执行 /initDestroy.do
        //目前是访问url才执行的，那有没有办法，tomcat一启动就new对象 再初始化
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        System.out.println("服务");

        System.out.println("可以把结果响映到浏览器");
    }

    @Override
    public void destroy() {
        System.out.println("销毁  destroy");
    }
}
