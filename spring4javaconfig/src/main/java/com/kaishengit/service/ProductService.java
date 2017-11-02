package com.kaishengit.service;

import com.kaishengit.entity.Tuser;
import org.springframework.stereotype.Service;

/**
 * @author zh
 * Created by Administrator on 2017/10/30.
 */
@Service
public interface ProductService {
    void save(Tuser tuser);
    void save();
}
