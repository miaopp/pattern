package com.miaopp.pattern;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.miaopp.pattern.singleton.LazySingleton;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Created by miaoping on 16/11/7.
 */
public class SingletonTest {
    @Test
    public void run() {
        LazySingleton singleton = LazySingleton.getInstance();
        singleton.setFirstName("ping");
        singleton.setLastName("miao");
        System.out.println(singleton.toString());
    }
}
