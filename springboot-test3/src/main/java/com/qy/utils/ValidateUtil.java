package com.qy.utils;

import com.qy.exception.ApiException;
import com.qy.utils.constants.ExceptionConstants;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.Collection;

/**
 * 参数校验工具
 *
 * @author: lsw
 * @Date: 2019/8/19 9:43
 */
public final class ValidateUtil {

    private ValidateUtil(){}

    /**
     * 校验真
     *
     * @param expression    表达式
     * @param message       提示信息
     * @throws ApiException 异常
     */
    public static void isTrue(boolean expression, String message) throws ApiException {
        if (!expression) {
            throw new ApiException(ExceptionConstants.EXCEPTION_ERROR, message);
        }
    }

    /**
     * 校验不为null
     *
     * @param object        对象
     * @param message       提示信息
     * @throws ApiException 异常
     */
    public static void notNull(Object object, String message) throws ApiException {
        if (object == null) {
            throw new ApiException(ExceptionConstants.EXCEPTION_ERROR, message);
        }
    }

    /**
     * 校验集合不为空
     *
     * @param collection    集合
     * @param message       提示信息
     * @throws ApiException 异常
     */
    public static void notEmpty(Collection collection, String message) throws ApiException {
        if (CollectionUtils.isEmpty(collection)) {
            throw new ApiException(ExceptionConstants.EXCEPTION_ERROR, message);
        }
    }

    /**
     * 校验字符串不能为null且不能为""
     *
     * @param str           字符串
     * @param message       提示信息
     * @throws ApiException 异常
     */
    public static void strNotBlank(String str, String message) throws ApiException {
        if (StringUtils.isBlank(str)) {
            throw new ApiException(ExceptionConstants.EXCEPTION_ERROR, message);
        }
    }
}
