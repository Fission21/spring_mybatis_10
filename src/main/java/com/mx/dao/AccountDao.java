package com.mx.dao;

import com.mx.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao {

    @Insert("insert into t_user(name,password,age)values(#{name},#{password},#{age})")
    void save(Account account);

    @Delete("delete from t_user where id = #{id} ")
    void delete(Integer id);

    @Update("update t_user set name = #{name} , password = #{password} where id = #{id} ")
    void update(Account account);

    @Select("select * from t_user")
    List<Account> findAll();

    @Select("select * from t_user where id = #{id} ")
    Account findById(Integer id);
}
