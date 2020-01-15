package com.qy.exception;

/**
 * 这个是返回给页面，显示操作是否成功的标志
 *
 * @author QY3022
 * @date 1/14
 */
public class ApiException extends Exception{
    private static final long serialVersionUID = -8467257091128458758L;
    private Integer code;

    private String message;

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public ApiException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public ApiException(String message) {
        this.message = message;
    }
}
