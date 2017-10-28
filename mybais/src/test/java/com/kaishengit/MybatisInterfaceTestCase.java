package com.kaishengit;

import com.kaishengit.entily.Admin;
import com.kaishengit.mapper.AdminMapper;
import com.kaishengit.util.Mybatisutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zh
 * Created by Administrator on 2017/10/27.
 */
public class MybatisInterfaceTestCase {
    private SqlSession sqlSession;
    private AdminMapper adminMapper;
    @Before
    public void init(){
        sqlSession = Mybatisutil.getSqlSession();
         adminMapper = sqlSession.getMapper(AdminMapper.class);
    }

    @After
    public void after(){
        sqlSession.close();
    }

    @Test
    public  void  save(){
        //sqlSession对象根据接口的class动态创建接口的实现类
        //动态代理模式
        //AdminMapper adminMapper = sqlSession.getMapper(AdminMapper.class);//创建接口的实现类，从而可以获得接口的完全限定名称com.kaishengit.mapper.AdminMapper，在mybatis.xml文件中
        //找到配置的AdminMapper.xml文件，在AdminMapper.xml文件中根据nameSpace的名称来找到对应的mapper节点。完全限定名称和namespace名称一样
        //时就会找到对应的mapper节点。
        Admin admin = new Admin("VN","tom");
       int updateRows =  adminMapper.save(admin);//当调用save方法时，会在mapper节点中找到id是save的。
        //sqlSession.commit();//因为在工具类中已经设置了自动提交所以不用commit提交
       System.out.println("影响的行数————————————————————————"+updateRows);
       System.out.println("自动生成主键的ID_____________________"+admin.getId());
    }

    @Test
    public void delete (){
//        Admin admin = new Admin();
        adminMapper.delete(17L);

    }


    @Test
    public void deleteName(){
        adminMapper.deleteName("tom");
    };

    @Test
    public void update(){
        Admin admin = new Admin();
        admin = adminMapper.findById(20L);
        admin.setAdminPassword("UZI");
        admin.setAdminName("RNG");
        adminMapper.update(admin);
    }

    @Test
    public void findAll(){
        List<Admin> admins = adminMapper.findAll();
        for (Admin admin : admins){
            System.out.println(admin);
        }
    }

    @Test
    public void findById(){
       Admin admin = adminMapper.findById(18L);
       System.out.print(admin);
    }

   /* @Test
    public  void page(){

        Map<String,Integer> map = new HashMap<>();
        map.put("offset",0);
        map.put("size",3);
        List<Admin> admins =  adminMapper.page(map);
        for (Admin admin : admins){
            System.out.println(admin);

        }

    }*/
   @Test
    public  void page(){

        List<Admin> admins = adminMapper.page(0,4);
        for (Admin admin : admins){
            System.out.println(admin);
        }

    }
}
