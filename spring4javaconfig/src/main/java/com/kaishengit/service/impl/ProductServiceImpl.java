package com.kaishengit.service.impl;

import com.kaishengit.dao.ProductDao;
import com.kaishengit.dao.SpringJdbcTemplateTuserDao;
import com.kaishengit.entity.Tuser;
import com.kaishengit.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Autowired
    private SpringJdbcTemplateTuserDao tuserDao;

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

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void save(Tuser tuser) {//表示此方法在执行时出现在事务中，如果Transaction加载类上，表示这个类中的所有方法都会出现在事务中

            tuserDao.save(tuser);
            if (1==1){
                throw new RuntimeException();
            }
            tuserDao.save(tuser);
    }
}
