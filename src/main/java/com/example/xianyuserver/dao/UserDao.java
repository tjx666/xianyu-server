package com.example.xianyuserver.dao;/*
 *
 * @Author: YuTengjing
 * @Date: 2018/12/28 13:55
 * @Version 1.0
 */

import com.example.xianyuserver.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    @Select("select * from user")
    public List<User> getUsers();
    
    @Select("select * from user where id=#{id}")
    public User findUserById(String id);
    
    @Insert("insert into user (id, name, password) VALUES (#{id}, #{name}, #{password});")
    public int insert(User user);
}
