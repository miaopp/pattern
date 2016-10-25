package com.miaopp.leetcode;

/**
 * Created by miaoping on 16/10/21.
 * 检测一个数是否为丑陋数
 * 丑陋数定义：质数因子只能是2，3，5
 * 解法：不停的除以这些质数，如果剩余的数字是1那么就是丑陋数
 */
public class UglyNumber {

    public boolean isUgly(int num) {
        while (num >= 2) {
            if (0 == num % 2) {
                num /= 2;
            } else if (0 == num % 3) {
                num /= 3;
            } else if (0 == num % 5) {
                num /= 5;
            } else {
                return false;
            }
        }
        return 1 == num;
    }
}
