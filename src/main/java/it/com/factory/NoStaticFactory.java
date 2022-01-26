package it.com.factory;

import it.com.dao.UserDao;
import it.com.dao.impl.UserDaoImpl;

/**
 * @ClassName NoStaticFactory
 * @Description
 * @Author nikai
 * @Date 2022/1/21 10:30
 * @Version 1.0
 **/
public class NoStaticFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
