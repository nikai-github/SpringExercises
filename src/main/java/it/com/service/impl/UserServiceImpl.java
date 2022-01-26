package it.com.service.impl;

import it.com.dao.UserDao;
import it.com.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author nikai
 * @Date 2022/1/26 14:19
 * @Version 1.0
 **/
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void service() {
        userDao.set();
    }

//    有参构造注入
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }
//
//    public UserServiceImpl() {
//    }

//    @Override
//    public void service() {
//        userDao.set();
//    }
}
