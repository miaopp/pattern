package com.miaopp.pattern.abstractfactory;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by miaoping on 16/11/3.
 */
public enum ComputerType {
    PC("PC", "普通计算机"),
    MAC("MAC", "苹果计算机");

    String type;
    String name;

    ComputerType(String type, String name) {
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

    public static ComputerType valuesOf(String type) {
        for (ComputerType computerType : ComputerType.values()) {
            if (StringUtils.equals(type, computerType.type)) {
                return computerType;
            }
        }
        return null;
    }
}
