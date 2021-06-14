package com.javacto.test;

import com.javacto.po.User;
import com.javacto.service.UserService;
import com.javacto.service.UserServiceImpl;
import com.javacto.utils.PageInfo;

import java.util.List;

public class TestUser {
    public static void main(String[] args) {
        UserService userService=new UserServiceImpl();
        PageInfo pageInfo=new PageInfo();
        pageInfo.setPageNo(2);
        pageInfo.setPageSize(3);

        List<User> list=userService.queryAll();
        for (User u:list){
            System.out.println(u);
        }
       /* System.out.println(userService.findUserById(15));*/
        System.out.println(userService.getTotalCount(null));
    }
}
