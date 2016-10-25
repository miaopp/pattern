package com.miaopp.pattern.strategy.impl;

import com.miaopp.pattern.strategy.DiscountStrategy;

import java.math.BigDecimal;

/**
 * Created by miaoping on 16/10/25.
 */
public class PercentageStrategy implements DiscountStrategy {

    private BigDecimal price;

    private int number;

    private Float percent;

    public PercentageStrategy(BigDecimal price, int number, Float percent) {
        this.price = price;
        this.number = number;
        this.percent = percent;
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

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public BigDecimal calculateDiscount() {
        return price.multiply(new BigDecimal(number)).multiply(new BigDecimal(percent));
    }
}
