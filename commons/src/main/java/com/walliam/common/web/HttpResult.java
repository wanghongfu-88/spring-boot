package com.walliam.common.web;

import com.walliam.common.constont.ResponseCode;

import java.io.Serializable;

public class HttpResult<T> implements Serializable {

    private int code;

    private String message;

    private T data;

    public HttpResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public HttpResult(ResponseCode resCode, T data){
        this.code = resCode.getCode();
        this.message = resCode.getMessage();
        this.data = data;
    }

    public HttpResult(T data){
        this(ResponseCode.SUCCESS,data);
    }

    public static <T> HttpResult<T> returnSuccess(){
        return new HttpResult<T>(null);
    }

    public static <T> HttpResult<T> returnSuccess(T data){
        return new HttpResult<T>(data);
    }

    public static <T> HttpResult<T> returnSuccess(ResponseCode resCode,T data){
        return new HttpResult<T>(resCode,data);
    }

    public static <T> HttpResult<T> returnFail(){
        return new HttpResult<T>(ResponseCode.FAIL,null);
    }

    public static <T> HttpResult<T> returnFail(T data){
        return new HttpResult<T>(ResponseCode.FAIL,data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
