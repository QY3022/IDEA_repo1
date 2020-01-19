package com.exception;

/**
 * @author QY3022
 * @date 2020/1/8
 * 这个是自定义Exception,用于返回给页面的两个异常参数，出现异常，则返回这两个给页面
 */
public class APIException extends Exception {
    private final static long serialVersionUID = -8467257091128458758L;

    public Integer code;

    public APIException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public APIException(String msg) {
        super(msg);
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
