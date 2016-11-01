package com.miaopp.pattern.simplefactory.impl;

import com.miaopp.pattern.simplefactory.Parallelogram;

/**
 * Created by miaoping on 16/10/28.
 */
public class Square implements Parallelogram {

    private float length;

    public Square() {

    }

    public Square(float length) {
        this.length = length;
    }

    public float calculateArea() {
        return length * length;
    }
}
