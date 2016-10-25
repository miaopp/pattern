package com.miaopp.pattern.strategy.impl;

import com.miaopp.pattern.strategy.DiscountStrategy;

import java.math.BigDecimal;

/**
 * Created by miaoping on 16/10/25.
 */
public class NoDiscountStrategy implements DiscountStrategy {

    private BigDecimal price;

    private int number;

    public NoDiscountStrategy(BigDecimal price, int number) {
        this.price = price;
        this.number = number;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BigDecimal calculateDiscount() {
        return new BigDecimal(0);
    }
}
