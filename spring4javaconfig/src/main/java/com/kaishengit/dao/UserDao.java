package com.kaishengit.dao;

/**
 * @author zh
 * Created by Administrator on 2017/10/30.
 * 不配置ApplicationContext.xml文件不添加注解，手动添加到Spring容器中
 */
public class UserDao {

    public void save() {
        System.out.println("userDao----save");
    }
}
