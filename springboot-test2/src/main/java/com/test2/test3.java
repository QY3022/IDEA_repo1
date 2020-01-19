package com.test2;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class test3 {

    @Test
    public void TetsMap() {
        Map<String, List<String>> map = Maps.newHashMap();
        List<String> list = Lists.newArrayList();
        list.add("春");
        list.add("夏");
        list.add("秋");
        list.add("冬");
        map.put("s", list);
        System.out.println(map.toString());
    }

}
