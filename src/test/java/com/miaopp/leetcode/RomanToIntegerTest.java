package com.miaopp.leetcode;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by miaoping on 16/10/15.
 */
public class RomanToIntegerTest {
    @Test
    public void run() {
        System.out.println(new RomanToInteger().romanToInt("CD"));
    }

    @Test
    public void run1() {
        Map<String, List<String>> map = Maps.newHashMap();
        map.put("aaaa", Arrays.asList("aaa", "bbb", "ccc"));
        map.put("bbbb", Arrays.asList("ddd", "eee", "fff"));
        System.out.println(JSON.toJSONString(map));
    }
}
