package com.miaopp.leetcode;

/**
 * Created by miaoping on 16/10/15.
 * 将罗马数字转换成对应的阿拉伯数字
 * 输入字符串长度保证在1~3999之间
 */
public class RomanToInteger {

    private String romans = "IVXLCDM";

    private int[] romanInteger = {1, 5, 10, 50, 100, 500, 1000};

    public int romanToInt(String s) {
        int res = 0;
        if (null == s || s.length() == 0) {
            return res;
        }
        int[] romanTrans = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            romanTrans[i] = romanInteger[romans.indexOf(s.charAt(i))];
        }
        for (int i = 0; i < romanTrans.length - 1; i++) {
            if (romanTrans[i] < romanTrans[i+1]) {
                res += 0 - romanTrans[i];
            } else {
                res += romanTrans[i];
            }
        }
        res += romanTrans[romanTrans.length - 1];
        return res;
    }
}
