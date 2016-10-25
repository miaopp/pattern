package com.miaopp.leetcode;

import org.junit.Test;

/**
 * Created by miaoping on 16/10/21.
 */
public class ValidAnagramTest {
    @Test
    public void run() {
        String s = "anagram", t = "nagaram";
        System.out.println(new ValidAnagram().isAnagram(s, t));
    }
}
