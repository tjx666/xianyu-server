package com.example.xianyuserver.service;


import com.example.xianyuserver.service.user.UserService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    private static Logger logger;

    @BeforeClass
    public static void setup() {
         logger = LoggerFactory.getLogger(UserServiceTest.class);
    }

    @Autowired
    public UserService userService;

    @Test
    public void getUserCount() {
        logger.info("测试日志");
    }
}
