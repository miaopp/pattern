package com.miaopp.pattern;

import com.miaopp.pattern.simplefactory.Creator;
import org.junit.Test;

/**
 * Created by miaoping on 16/10/28.
 */
public class SimpleFactoryPatternTest {
    @Test
    public void run() {
        float length = 5f, width = 3f;
        float rectangleArea = Creator.factory(length, width).calculateArea();
        float squareArea = Creator.factory(length, length).calculateArea();
        System.out.println("the area of rectangle is " + rectangleArea);
        System.out.println("the area of square is " + squareArea);
    }
}
