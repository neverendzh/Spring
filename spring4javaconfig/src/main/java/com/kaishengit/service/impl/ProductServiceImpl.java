package com.kaishengit.service.impl;

import com.kaishengit.dao.ProductDao;
import com.kaishengit.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @author zh
 * Created by Administrator on 2017/10/30.
 */
//注入到Spring容器中
@Service
public class ProductServiceImpl implements ProductService {

    //可以直接放在属性上直接注入对象
    //@Autowired
    //@Inject
    @Resource
    private ProductDao productDao;

    /*
    @Autowired
    public ProductServiceImpl (ProductDao productDao){
        this.productDao = productDao;
    }*/
//    注入Spring容器
   /* @Autowired
    public void setProductDao(ProductDao productDao){
        this.productDao = productDao;
    }*/

    @Override
    public void save() {
            productDao.save();
    }
}
