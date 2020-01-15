package com.qy.utils;

import com.qy.utils.column.CodeEnum;
import org.apache.commons.lang3.StringUtils;

/**
 * @author QY3022
 * @date 2020/1/15
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        //通过反射取出Enum所有常量的属性值
        for (T each: enumClass.getEnumConstants()) {
            //利用code进行循环比较，获取对应的枚举
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }

    public static <T extends CodeEnum> T getByName(String name, Class<T> enumClass) {
        //通过反射取出Enum所有常量的属性值
        for (T each: enumClass.getEnumConstants()) {
            //利用name进行循环比较，获取对应的枚举
            String eachName = String.valueOf(each.getName());
            if (StringUtils.equalsIgnoreCase(name, eachName)) {
                return each;
            }
        }
        return null;
    }
}
