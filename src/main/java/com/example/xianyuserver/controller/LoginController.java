package com.example.xianyuserver.controller;/*
 *
 * @Author: YuTengjing
 * @Date: 2018/12/28 19:29
 * @Version 1.0
 */

import com.example.xianyuserver.dto.LoginInfoDto;
import com.example.xianyuserver.entity.User;
import com.example.xianyuserver.service.user.UserService;
import com.example.xianyuserver.util.ApiResult;
import com.example.xianyuserver.util.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private UserService userService;
    
    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }
    
    @PostMapping
    public ApiResult checkLogin(@RequestBody LoginInfoDto loginInfo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ApiResult.fail(ResultCode.PARAM_TYPE_BIND_ERROR, "请检查你提交的数据");
        } else {
            User user = userService.getUserById(loginInfo.getId());
            
            if (user == null) {
                return ApiResult.fail(400, "登入失败", "该账号未注册");
            } else if (!user.getPassword().equals(loginInfo.getPassword())){
                return ApiResult.fail(400, "登入失败", "密码错误");
            } else {
                return ApiResult.success(user);
            }
        } 
    }
    
}
