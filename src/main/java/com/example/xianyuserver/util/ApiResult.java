package com.example.xianyuserver.util;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ApiResult implements Serializable {

    private static final long serialVersionUID = -3948389268046368059L;
    private Integer code;
    private String msg;
    private Object data;

    public ApiResult() {}

    public ApiResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    
    public static ApiResult success() {
        ApiResult result = new ApiResult();
        result.setResultCode(ResultCode.SUCCESS);
        return result;
    }

    public static ApiResult success(Object data) {
        ApiResult result = new ApiResult();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }
    
    
    public static ApiResult fail(Integer code, String message) {
        return ApiResult.fail(code, message, "");
    }

    public static ApiResult fail(Integer code, String message, String detail) {
        ApiResult result = new ApiResult();
        result.setCode(code);
        result.setMsg(message);
        result.setData(detail);
        return result;
    }
    
// 使用 ResultCode
    public static ApiResult fail(ResultCode resultCode) {
        ApiResult result = new ApiResult();
        result.setResultCode(resultCode);
        return result;
    }

    public static ApiResult fail(ResultCode resultCode, String detail) {
        ApiResult result = new ApiResult();
        result.setResultCode(resultCode);
        result.setData(detail);
        return result;
    }
    
    public void setResultCode(ResultCode code) {
        this.code = code.code();
        this.msg = code.message();
    }
}