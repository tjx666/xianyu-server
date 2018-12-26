package com.example.xianyuserver.exception;


import com.example.xianyuserver.util.ResultCode;

/*
 * @Author: YuTengjing
 * @Date: 2018/12/26 22:13
 * @Version 1.0
 */
public class BaseException extends RuntimeException {
    private String message;
    private Integer code;  //错误码
    private String detail;

    public BaseException() {
        this.code = 400;
        this.message = "未知错误";
    }

    public BaseException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    
    public BaseException(ResultCode resultCode, String detail) {
        super(resultCode.message());
        this.code = resultCode.code();
        this.message = resultCode.message();
        this.detail = detail;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
