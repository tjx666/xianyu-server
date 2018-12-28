package com.example.xianyuserver.service.user;

import com.example.xianyuserver.dto.LoginInfoDto;
import com.example.xianyuserver.dto.RegisterUserDto;
import com.example.xianyuserver.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @author YuTengjing
 */

@Service
public interface UserService {
    List<User> getUserList();
    User getUserById(String id);
    boolean registerNewUser(RegisterUserDto newUser);
}
