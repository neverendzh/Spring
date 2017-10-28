package com.kaishengit.mapper;
import com.kaishengit.entily.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author zh
 *
 */
public interface AdminMapper {

    /**
     *用于保存用户信息
     * @param admin 传入Admin对象
     * @return 返回影响的行数
     */
    int save(Admin admin);

    /**
     * 根据id删除
     * @param id 参数为long类型
     * @return 返回int类型影响的行数
     */
    int delete (long id);

    /**
     * 根据姓名删除
     * @param name 参数类型为String类型
     */
    void deleteName(String name);


    /**用于修改Admin对象的属性值
     *
     * @param admin 参数类型未Admin对象
     */
    void update (Admin admin);

    /**
     * 根据id查找
     * @param id long类型的参数
     * @return 返回Admin对象
     */
     Admin findById(long id);

    /**
     *用于查找所有
     * @return 返回 List集合
     */
     List<Admin> findAll();

    /**
     * @param offset int型参数从第几个开始取
     * @param size 取几个
     * @return 返回Admin对象
     */
     List<Admin> page(@Param("offset") int offset,@Param("size") int size); //因为这个AdminMapper.xml文件中是没办法传入对个值只能是一个，
    //    如果需要传入多个参数
    // 1· 就是封装成对象传入
    // 2. 就是传入一个map集
    // 3. 如果必须要使用传入两个参数就需要在AdminMapper.xml文件中配置arg0，arg1；param1，param2；这两套参数，这是mybatis框架所支持的。
    // 因为在央射故去不会央射你定义的参数名，只会获取第几个参数的值。
    //4.在参数前面加上注解@Param("size")来给参数命名，可以不用再AdminMapper中使用指定的参数arg0，arg1

    /**
     *用于分页
     * @param map 传入一个Map集合
     * @return 返回一个List集合
     */
    List<Admin> page(Map<String,Integer> map);//key为参数的名称，value为参数的值

}
