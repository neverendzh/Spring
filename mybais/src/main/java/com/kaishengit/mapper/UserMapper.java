package com.kaishengit.mapper;

import com.kaishengit.entily.User;

/**
 * @author zh
 * Created by Administrator on 2017/10/28.
 */
public interface UserMapper {
    /**
     *用于left join 查询实例
     * @param userId int 类型Id
     * @return  返回user对象
     */
    User findById(Integer userId);
}
