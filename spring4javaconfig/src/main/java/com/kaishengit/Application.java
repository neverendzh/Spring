package com.kaishengit;

import com.kaishengit.dao.UserDao;
import com.kaishengit.service.UserService;
import com.kaishengit.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zh
 * Created by Administrator on 2017/10/30.
 * 配置类，相当于applicationContext.xml文件
 */

@Configuration//表示这个是一个配置类
@ComponentScan//表示自带扫描，以本类为根节点，扫描本类下所有的包。
@EnableAspectJAutoProxy//表示基于AOP注解
public class Application {
    /**
     * 手动吧类对象添加到spring容器中，其中方发名是在配置文件中的bean节点中id的属性值
     * @return 返回UserDao对象
     */
    @Bean
    public UserDao userDao(){
        return  new UserDao();
    }

    @Bean
    public UserService userService(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDao());
        return userService;
    }
}
