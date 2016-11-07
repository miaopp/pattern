package com.miaopp.pattern.singleton;

/**
 * Created by miaoping on 16/11/7.
 */
public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}
