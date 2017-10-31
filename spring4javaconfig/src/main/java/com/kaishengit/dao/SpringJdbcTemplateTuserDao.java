package com.kaishengit.dao;

import com.kaishengit.entity.Tuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author zh
 * Created by Administrator on 2017/10/30.
 */
@Repository
public class SpringJdbcTemplateTuserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public  void  save(Tuser tuser){

        String sql = "insert into t_user(user_name,passwords,address,dept_id) values(?,?,?,?)";
        jdbcTemplate.update(sql,tuser.getUserName(),tuser.getPasswords(),tuser.getAddress(),tuser.getDeptId());
    }


    public Tuser findById(Long id){
        String sql = "select * from t_user where id = ? ";
        //return jdbcTemplate.queryForObject(sql, new TuserMapper(),id);
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Tuser.class),id);
    }

    public List<Tuser> findAll(){
        String sql = "select * from t_user order by id desc";

        return jdbcTemplate.query(sql, new TuserMapper());
    }

    public Long count(){
        String sql = "select count(*) from t_user";
        return  jdbcTemplate.queryForObject(sql,Long.class);
    }

    private class TuserMapper implements RowMapper<Tuser>{

        @Override
        public Tuser mapRow(ResultSet resultSet, int i) throws SQLException {
            Tuser tuser = new Tuser();
            tuser.setUserName(resultSet.getString("user_name"));
            tuser.setPasswords(resultSet.getString("passwords"));
            tuser.setAddress(resultSet.getString("address"));
            tuser.setDeptId(resultSet.getInt("dept_id"));
            tuser.setId(resultSet.getInt("id"));
            return tuser;
        }
    }
}
