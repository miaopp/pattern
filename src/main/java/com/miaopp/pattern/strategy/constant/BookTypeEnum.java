package com.miaopp.pattern.strategy.constant;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by miaoping on 16/10/25.
 */
public enum BookTypeEnum {
    TESTBOOK("textbook", "教科书"),
    CARTOON("cartoon", "连环画"),
    COMPUTERSCIENCE("computerscience", "计算机科学"),
    OTHER("other", "其他图书");

    String type;
    String name;

    BookTypeEnum(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static BookTypeEnum valuesOf(String type) {
        for (BookTypeEnum typeEnum : BookTypeEnum.values()) {
            if (StringUtils.equals(type, typeEnum.type)) {
                return typeEnum;
            }
        }
        return null;
    }
}
