package it.com.demo;

import it.com.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName UserController
 * @Description
 * @Author nikai
 * @Date 2022/1/21 10:03
 * @Version 1.0
 **/
public class UserController {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.service();
    }
}
