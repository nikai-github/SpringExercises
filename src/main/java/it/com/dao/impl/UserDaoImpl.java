package it.com.dao.impl;

import it.com.user.User;
import it.com.dao.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @ClassName UserDaoImpl
 * @Description
 * @Author nikai
 * @Date 2022/1/21 10:01
 * @Version 1.0
 **/
public class UserDaoImpl implements UserDao {
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void set() {
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("Running Spring Start");
    }
}
