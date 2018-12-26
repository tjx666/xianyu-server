package com.example.xianyuserver.util;

import com.example.xianyuserver.exception.BaseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/*
 * @Author: YuTengjing
 * @Date: 2018/12/26 22:08
 * @Version 1.0
 */

/**
 * 全局异常处理
 */
@Slf4j
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    //声明要捕获的异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ApiResult defaultExceptionHandler(HttpServletRequest request, Exception e) {
        e.printStackTrace();
        
        if(e instanceof BaseException) {
            log.error("Exception happen! code: {}, msg: {}", ((BaseException) e).getCode(), e.getMessage());
            return ApiResult.fail(((BaseException) e).getCode(), e.getMessage(), ((BaseException) e).getDetail());
        }

        return new ApiResult(400, "Server exception!");
    }

}
