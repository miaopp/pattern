package com.miaopp.pattern.simplefactory.impl;

import com.miaopp.pattern.simplefactory.Parallelogram;

/**
 * Created by miaoping on 16/10/28.
 */
public class Rectangle implements Parallelogram {

    private float length = 0f;

    private float width = 0f;

    public Rectangle() {

    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float calculateArea() {
        return length * width;
    }
}
