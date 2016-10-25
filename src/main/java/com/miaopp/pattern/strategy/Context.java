package com.miaopp.pattern.strategy;

import com.miaopp.pattern.strategy.constant.BookTypeEnum;
import com.miaopp.pattern.strategy.impl.FlatRateStrategy;
import com.miaopp.pattern.strategy.impl.NoDiscountStrategy;
import com.miaopp.pattern.strategy.impl.PercentageStrategy;

import java.math.BigDecimal;

/**
 * Created by miaoping on 16/10/25.
 * 策略模式环境角色，持有一个Strategy引用
 */
public class Context {

    private DiscountStrategy discountStrategy;

    public Context() {
        discountStrategy = new NoDiscountStrategy(new BigDecimal(0), 0);
    }

    public Context(BigDecimal price, int number, Float percent, BigDecimal discountPrice, BookTypeEnum typeEnum) {
        switch (typeEnum) {
            case TESTBOOK:
                discountStrategy = new FlatRateStrategy(price, number, discountPrice);
                break;
            case CARTOON:
                discountStrategy = new PercentageStrategy(price, number, percent);
                break;
            case COMPUTERSCIENCE:
                discountStrategy = new PercentageStrategy(price, number, percent);
                break;
            case OTHER:
                discountStrategy = new NoDiscountStrategy(price, number);
                break;
            default:
                discountStrategy = new NoDiscountStrategy(price, number);
        }
    }

    /**
     * 策略方法
     */
    public BigDecimal calculateDiscount() {
        return discountStrategy.calculateDiscount();
    }
}
