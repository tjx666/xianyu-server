package com.example.xianyuserver.controller;

import com.example.xianyuserver.dto.RegisterUserDto;
import com.example.xianyuserver.service.user.UserService;
import com.example.xianyuserver.util.ApiResult;
import com.example.xianyuserver.util.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping(value = "/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("")
    public ApiResult getUsers() {
        log.debug("获取所有user");
        return ApiResult.success(userService.getUserList());
    }
    
    @GetMapping("/{id}")
    public ApiResult getUser(@PathVariable String id) {
        log.debug("Id 为:{}", id);
        return ApiResult.success(userService.getUserById(id));
    }
    
    @PostMapping(value = "")
    public ApiResult registerNewUser(@RequestBody RegisterUserDto user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ApiResult.fail(ResultCode.PARAM_TYPE_BIND_ERROR, "请检查您的参数");
        } else {
            userService.registerNewUser(user);
            return ApiResult.success("注册成功");
        }
    }

}
