package com.miaopp.pattern;

import com.miaopp.pattern.abstractfactory.ComputerProducer;
import com.miaopp.pattern.abstractfactory.MacProducer;
import com.miaopp.pattern.abstractfactory.PCProducer;
import org.junit.Test;

/**
 * Created by miaoping on 16/11/3.
 */
public class AbstractFactoryTest {

    @Test
    public void run() {
        //Mac
        ComputerProducer producer = ComputerProducer.getInstance("MAC");
        System.out.println("cpu name: " + producer.createCpu().getCpuName());
        System.out.println("ram size: " + producer.createRam().size() + "GB");
        ComputerProducer producer1 = ComputerProducer.getInstance("PC");
        System.out.println("cpu name: " + producer1.createCpu().getCpuName());
        System.out.println("ram size: " + producer1.createRam().size() + "GB");
    }
}
