package com.miaopp.pattern.simplefactory;

import com.miaopp.pattern.simplefactory.constant.ParallelogramTypeEnum;
import com.miaopp.pattern.simplefactory.impl.Rectangle;
import com.miaopp.pattern.simplefactory.impl.Square;

/**
 * Created by miaoping on 16/10/28.
 */
public class Creator {

    public static Parallelogram factory(float length, float width) {
        switch(judgeShape(length, width)) {
            case RECTANGLE:
                return new Rectangle(length, width);
            case SQUARE:
                return new Square(length);
        }
        return new Rectangle(length, width);
    }

    private static ParallelogramTypeEnum judgeShape(float length, float width) {
        if (length == width) {
            return ParallelogramTypeEnum.SQUARE;
        } else {
            return ParallelogramTypeEnum.RECTANGLE;
        }
    }
}
