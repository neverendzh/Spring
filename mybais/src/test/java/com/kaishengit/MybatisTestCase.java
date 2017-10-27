package com.kaishengit;

import com.kaishengit.entily.Admin;
import com.kaishengit.util.Mybatisutil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

/**
 * @author zh
 */
public class MybatisTestCase {
    @Test
    public void save() throws Exception{
        //读取配置文件
        Reader reader = Resources.getResourceAsReader("mybatis.xml");
       //根据reader输入流来创建SQLSessionFactory对象
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //根据SQLSessionFactory对象来创建SQLSession
        SqlSession sqlSession = sessionFactory.openSession(true);//传入true自动提交事务，不写默认不会自动提交

        Admin admin = new Admin("jak","123");

        //执行insert操作
        sqlSession.insert("com.kaishengit.mapper.AdminMapper.save",admin);
        //提交事务
       // sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    @Test
    public void findAll(){
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        List<Admin> adminlist = sqlSession.selectList("com.kaishengit.mapper.AdminMapper.findAll");
        for (Admin admin :adminlist){
            System.out.println(admin);

        }
        sqlSession.close();

    }

    @Test
    public void findById(){
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        Admin admin = sqlSession.selectOne("com.kaishengit.mapper.AdminMapper.findById",14L);
        System.out.println(admin);
    }

    @Test
    public  void update(){
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        Admin admin = sqlSession.selectOne("com.kaishengit.mapper.AdminMapper.findById",14L);
        admin.setAdminPassword("tom");

        sqlSession.update("com.kaishengit.mapper.AdminMapper.update",admin);
        sqlSession.close();
    }

    @Test
    public  void delete (){
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        sqlSession.delete("com.kaishengit.mapper.AdminMapper.delete",14L);
        sqlSession.close();
    }
}