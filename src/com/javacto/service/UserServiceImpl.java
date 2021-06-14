package com.javacto.service;

import com.javacto.dao.UserDao;
import com.javacto.dao.UserDaoImpl;
import com.javacto.po.User;
import com.javacto.utils.PageInfo;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao=new UserDaoImpl();
    /**
     * 添加
     */
    public int addUser(User user){
        int num=0;
        num=userDao.addUser(user);
        return num;
    }
    /**
     * 删除
     */
    public int deleteUser(int id){

        return userDao.deleteUser(id);
    }

    /**
     * 根据ID查询
     */
    public User findUserById(int id){

        return userDao.findUserById(id);
    }
    /**
     * 修改
     */
    public  int updateUser(User user){

        return userDao.updateUser(user);
    }

    /**
     * 查询所有
     */
    public List<User> queryAll(){

        return userDao.queryAll();
    }
    /**
     * 获取总条数
     * @return
     */
    public int getTotalCount(User user){
        return userDao.getTotalCount(user);
    }
    /**
     * 分页查询
     */
    public List<User> pageQueryUser(PageInfo pageInfo, User user){
        return userDao.pageQueryUser(pageInfo,user);
    }
}
