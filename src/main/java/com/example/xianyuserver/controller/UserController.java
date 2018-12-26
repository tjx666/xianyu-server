package com.example.xianyuserver.controller;

import com.example.xianyuserver.exception.BaseException;
import com.example.xianyuserver.service.user.UserService;
import com.example.xianyuserver.util.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;
    
    @GetMapping(value = "", consumes = "application/json", produces = "application/json")
    public String getUsers() {
        return userService.getUserList();
    }
    
    
    @GetMapping("/{id}")
    public ApiResult getUser(@PathVariable String id) {
        log.debug("Id 为:{}", id);
        return ApiResult.success(userService.getUserById(id));
    }
    
    @GetMapping("test_exp")
    public ApiResult testExp() {
        throw new BaseException(444, "测试异常");
    }

}
