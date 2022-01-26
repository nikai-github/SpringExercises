package it.com.demo;

import it.com.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName UserDaoTest
 * @Description
 * @Author nikai
 * @Date 2022/1/21 10:03
 * @Version 1.0
 **/
public class UserDaoTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.set();
    }
}
