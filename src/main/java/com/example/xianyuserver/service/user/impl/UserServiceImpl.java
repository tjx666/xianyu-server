package com.example.xianyuserver.service.user.impl;

import com.example.xianyuserver.entity.User;
import com.example.xianyuserver.service.user.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: YuTengjing
 * @Date: 2018/12/26 20:52
 * @Version 1.0
 */

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUserList() {
        return "[\n" +
            "  {\n" +
            "    \"name\": \"ly\",\n" +
            "    \"age\": 21\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\": \"lyr\",\n" +
            "    \"age\": 20\n" +
            "  }\n" +
            "]";
    }
    
    @Override
    public User getUserById(String id) {
        User user = new User();
        user.setName("Lily");
        user.setId(id);
        return user;
        
    }
}
