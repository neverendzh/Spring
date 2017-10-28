package com.kaishengit.service.impl;

import com.kaishengit.dao.UserDao;
import com.kaishengit.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author zh
 * 注入类
 * Created by Administrator on 2017/10/28.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private Integer id;
    private String name;
    private List<String> nameList;
    private Set<UserDao> userDaoSet;
    private Map<String,UserDao> userDaoMap;
    private Properties properties;

    public UserDao getUserDao() {
        return userDao;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public Set<UserDao> getUserDaoSet() {
        return userDaoSet;
    }

    public Map<String, UserDao> getUserDaoMap() {
        return userDaoMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public void setUserDaoSet(Set<UserDao> userDaoSet) {
        this.userDaoSet = userDaoSet;
    }

    public void setUserDaoMap(Map<String, UserDao> userDaoMap) {
        this.userDaoMap = userDaoMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public void save() {
            userDao.save();
    }
}
