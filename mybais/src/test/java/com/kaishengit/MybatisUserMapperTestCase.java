package com.kaishengit;

import com.kaishengit.entily.User;
import com.kaishengit.mapper.UserMapper;
import com.kaishengit.util.Mybatisutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author zh
 * Created by Administrator on 2017/10/28.
 */
public class MybatisUserMapperTestCase {
    private SqlSession sqlSession;
    private UserMapper userMapper;
    @Before
    public void init(){
        sqlSession = Mybatisutil.getSqlSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @After
    public void after(){
        sqlSession.close();
    }

    @Test
    public void findById(){

        User user = userMapper.findById(4);
        System.out.println(user);
        System.out.println(user.getUserName()+"----->"+user.getDept().getDeptDepartment());
    }




}
