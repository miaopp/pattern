package com.miaopp.leetcode;

import org.junit.Test;

/**
 * Created by miaoping on 16/10/18.
 */
public class CountPrimesTest {

    @Test
    public void run() {
        CountPrimes countPrimes = new CountPrimes();
        System.out.println(countPrimes.isPrim(1));
        System.out.println(countPrimes.countPrimes(2));
    }
}
