package com.miaopp.pattern.strategy;

import com.miaopp.pattern.strategy.constant.BookTypeEnum;
import com.miaopp.pattern.strategy.impl.ConcreateStrategy;

import java.math.BigDecimal;

/**
 * Created by miaoping on 16/10/25.
 * 策略模式环境角色，持有一个Strategy引用
 */
public class Context {

    private Strategy strategy;

    public Context() {
        this.strategy = new ConcreateStrategy(BookTypeEnum.OTHER);
    }

    public Context(BookTypeEnum typeEnum) {
        this.strategy = new ConcreateStrategy(typeEnum);
    }

    /**
     * 策略方法
     */
    public BigDecimal calculatePerPrice(BigDecimal perPrice) {
        return strategy.calculateBookPerPrice(perPrice);
    }
}
