package com.miaopp.pattern.abstractfactory;

/**
 * Created by miaoping on 16/11/3.
 */
public class MacProducer extends ComputerProducer {

    public Cpu createCpu() {
        return new MacCpu();
    }

    public Ram createRam() {
        return new MacRam();
    }
}
