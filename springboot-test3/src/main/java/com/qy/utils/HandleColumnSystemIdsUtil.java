package com.qy.utils;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author 丘健里
 */
public class HandleColumnSystemIdsUtil {

    /**
     * 处理字段system_ids，将原来是1,2,3变成_1_,_2_,_3_
     *
     * @param ids
     * @return
     */
    public static String handleColumnSystemIds(String ids) {
        if (ids == null || "".equalsIgnoreCase(ids)) {
            return "";
        }
        String[] split = ids.split(",");
        List<String> list = Lists.newArrayList();
        for (String id : split) {
            id = "_" + id + "_";
            list.add(id);
        }
        String arrStrIds1 = list.toString().replace("[", "");
        return arrStrIds1.replace("]", "").trim();
    }

    /**
     * 去掉string字符串的_，两端去空
     *
     * @param id
     * @return
     */
    public static String removeColumnSystemIdsUnderLine(String id) {
        if (id == null || "".equalsIgnoreCase(id)) {
            return "";
        }
        return id.replace("_", "").trim();
    }

    /**
     * 获取表dts_system的Long类型的id
     *
     * @return
     */
    public static Long getTableDtsSystemLongId(String systemId) throws Exception {
        //原本的id是这样子的111+1，需要获取到+后面的1
        String[] split = systemId.split("\\+");
        if (split.length == 2) {
            String id = split[1];
            return Long.valueOf(id);
        } else {
            throw new Exception("systemId 出现了异常问题");
        }
    }

}
