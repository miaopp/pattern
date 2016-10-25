package com.miaopp.pattern.strategy.impl;

import com.miaopp.pattern.strategy.Strategy;
import com.miaopp.pattern.strategy.constant.BookTypeEnum;

import java.math.BigDecimal;

/**
 * Created by miaoping on 16/10/25.
 * 具体的计算策略
 */
public class ConcreateStrategy extends Strategy {

    private BookTypeEnum typeEnum;

    public ConcreateStrategy() {

    }

    public ConcreateStrategy(BookTypeEnum typeEnum) {
        this.typeEnum = typeEnum;
    }

    public BigDecimal calculateBookPerPrice(BigDecimal perPrice) {
        switch (typeEnum) {
            case TESTBOOK:
                return perPrice.subtract(new BigDecimal(1));
            case CARTOON:
                return perPrice.multiply(new BigDecimal(1.0f - 0.07f));
            case COMPUTERSCIENCE:
                return perPrice.multiply(new BigDecimal(1.0f - 0.03f));
            case OTHER:
                return perPrice;
            default:
                return perPrice;
        }
    }
}
