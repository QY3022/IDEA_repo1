package com.qy.utils;

import com.qy.exception.ApiException;

/**
 * @author QY3022
 * @date 2020/1/15
 */
public class ExceptionUtil {

    /**
     * 此类为正常向前端传递异常操作信息
     *
     * @param e
     * @param code
     * @param message
     * @return
     */
    public static Exception getException(Exception e, int code, String message) {
        if (e instanceof ApiException) {
            return e;
        } else {
            return new ApiException(code, message);
        }
    }
}
