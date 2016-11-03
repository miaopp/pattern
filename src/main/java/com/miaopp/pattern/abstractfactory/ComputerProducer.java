package com.miaopp.pattern.abstractfactory;

import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * Created by miaoping on 16/11/3.
 */
public abstract class ComputerProducer {

    public static ComputerProducer getInstance(String name) {
        ComputerType type = ComputerType.valueOf(name);
        switch (type) {
            case PC:
                return new PCProducer();
            case MAC:
                return new MacProducer();
            default:
                return null;
        }
    }

    public abstract Cpu createCpu();

    public abstract Ram createRam();
}
