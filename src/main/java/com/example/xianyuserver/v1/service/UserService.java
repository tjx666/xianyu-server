package com.example.xianyuserver.v1.service;

import org.springframework.stereotype.Service;

/**
 * @author YuTengjing
 */
@Service
public class UserService {
    public int getUserCount() {
        return 200 + (int)Math.floor(Math.random() * 1000);
    }
}
