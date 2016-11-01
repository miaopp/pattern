package com.miaopp.pattern.simplefactory.constant;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by miaoping on 16/10/28.
 */
public enum ParallelogramTypeEnum {
    SQUARE("square", "正方形"),
    RECTANGLE("rectangle", "长方形");

    String code;
    String name;

    ParallelogramTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ParallelogramTypeEnum valuesOf(String code) {
        for (ParallelogramTypeEnum typeEnum : ParallelogramTypeEnum.values()) {
            if (StringUtils.equals(code, typeEnum.code)) {
                return typeEnum;
            }
        }
        return null;
    }
}
