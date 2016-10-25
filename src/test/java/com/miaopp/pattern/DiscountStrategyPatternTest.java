package com.miaopp.pattern;

import com.miaopp.pattern.strategy.Context;
import com.miaopp.pattern.strategy.constant.BookTypeEnum;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by miaoping on 16/10/25.
 */
public class DiscountStrategyPatternTest {

    @Test
    public void run() {
        Context context = new Context();
        System.out.println(context.calculateDiscount());

        Context context1 = new Context(new BigDecimal(100), 100, null, new BigDecimal(1), BookTypeEnum.TESTBOOK);
        System.out.println(context1.calculateDiscount());

        Context context2 = new Context(new BigDecimal(100), 100, 0.07f, null, BookTypeEnum.CARTOON);
        System.out.println(context2.calculateDiscount().setScale(2, BigDecimal.ROUND_HALF_EVEN));

        Context context3 = new Context(new BigDecimal(100), 100, 0.04f, null, BookTypeEnum.COMPUTERSCIENCE);
        System.out.println(context3.calculateDiscount().setScale(2, BigDecimal.ROUND_HALF_EVEN));
    }
}
