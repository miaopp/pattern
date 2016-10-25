package com.miaopp.pattern.strategy;

import com.miaopp.pattern.strategy.constant.BookTypeEnum;

import java.math.BigDecimal;

/**
 * Created by miaoping on 16/10/25.
 */
public interface DiscountStrategy {

    public BigDecimal calculateDiscount();

}
