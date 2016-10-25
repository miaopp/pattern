package com.miaopp.leetcode;

/**
 * Created by miaoping on 16/10/21.
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] hash = new int[26];
        //初始化
        for (int i = 0; i < 26; i++) {
            hash[i] = 0;
        }
        for (int i= 0; i < s.length(); i++) {
            ++hash[s.charAt(i) - 'a'];
        }
        for (int i = 0; i < t.length(); i++) {
            if (--hash[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
