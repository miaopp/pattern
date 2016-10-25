package com.miaopp.pattern;

import com.miaopp.pattern.strategy.Context;
import com.miaopp.pattern.strategy.constant.BookTypeEnum;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by miaoping on 16/10/25.
 */
public class StrategyPatternTest {

    @Test
    public void run() {
        Context context = new Context(BookTypeEnum.COMPUTERSCIENCE);
        System.out.println(context.calculatePerPrice(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_UP));
    }
}
