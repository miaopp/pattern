package com.miaopp.leetcode;

/**
 * Created by miaoping on 16/10/18.
 */
public class CountPrimes {

    public int countPrimes(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrim(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isPrim(int number) {
        int count = 0;
        if (number <= 1 || number % 2 == 0) {
            return false;
        }
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (0 == number % i) {
                count++;
            }
        }
        return count <= 1;
    }
}
