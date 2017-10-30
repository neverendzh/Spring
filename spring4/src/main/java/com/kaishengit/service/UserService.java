package com.kaishengit.service;

/**
 * @author zh
 * Created by Administrator on 2017/10/28.
 */
public interface UserService {
    /**
     * 保存
     */
    void save();
    void update();

    /**
     * 用于测试AOP代理模式，测试方法的返回值
     * @return
     */
    int count();
}

