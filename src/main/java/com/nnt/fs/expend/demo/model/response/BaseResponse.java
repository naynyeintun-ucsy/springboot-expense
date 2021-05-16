package com.nnt.fs.expend.demo.model.response;

public class BaseResponse {

    int errorCode;
    String message;
    Object result;

    public BaseResponse(int errorCode, String message, Object result) {
        this.errorCode = errorCode;
        this.message = message;
        this.result = result;
    }
}
