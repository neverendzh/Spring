package com.kaishengit.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.inject.Named;

/**
 * @author zh
 * Created by Administrator on 2017/10/30.
 */
//可以设置别名，再后边根括号后跟名字，例如
@Repository("dao")
//java中支持的
//@Named
//不是单例
//@Scope("prototype")
// 懒加载
//@Lazy
public class ProductDao {

    public void save(){
        System.out.println("Product----save");
    }
}
