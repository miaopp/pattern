package com.miaopp.pattern.strategy.impl;

import com.miaopp.pattern.strategy.DiscountStrategy;

import java.math.BigDecimal;

/**
 * Created by miaoping on 16/10/25.
 */
public class FlatRateStrategy implements DiscountStrategy {

    private BigDecimal price;

    private int number;

    private BigDecimal discountPrice;

    public FlatRateStrategy(BigDecimal price, int number, BigDecimal discountPrice) {
        this.price = price;
        this.number = number;
        this.discountPrice = discountPrice;
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

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public BigDecimal calculateDiscount() {
        return discountPrice.multiply(new BigDecimal(number));
    }
}
