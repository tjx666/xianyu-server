package com.example.xianyuserver.service.user;

import com.example.xianyuserver.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author YuTengjing
 */
@Service
public interface UserService {
    public String getUserList();
    public User getUserById(String id);
}
