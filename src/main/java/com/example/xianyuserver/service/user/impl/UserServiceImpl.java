package com.example.xianyuserver.service.user.impl;

import com.example.xianyuserver.dao.UserDao;
import com.example.xianyuserver.dto.RegisterUserDto;
import com.example.xianyuserver.entity.User;
import com.example.xianyuserver.service.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @Author: YuTengjing
 * @Date: 2018/12/26 20:52
 * @Version 1.0
 */

@Slf4j
@Service
public class UserServiceImpl implements UserService {
   
    private UserDao userDao;
    
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    
    @Override
    public List<User> getUserList() {
        return userDao.getUsers();
    }
    
    @Override
    public User getUserById(String id) {
        return userDao.findUserById(id);
    }
    
    @Override
    public boolean registerNewUser(RegisterUserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setPassword(userDto.getPassword());
        int res = userDao.insert(user);
        log.debug("The insert return's integer is {}", res);
        
        return true;
    }
}
