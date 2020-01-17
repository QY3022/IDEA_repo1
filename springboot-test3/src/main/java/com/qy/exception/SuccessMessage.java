package com.qy.exception;

import java.io.Serializable;

/**
 * @author by QY3022
 * @date 2020/1/17.
 */
public class SuccessMessage implements Serializable {
    private static final long serialVersionUID = -7882454953469908760L;
    private String requestId;
    private String message;

    public SuccessMessage() {
        this.message = "成功";
    }

    public SuccessMessage(String message) {
        this.message = message;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
