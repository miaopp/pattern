package com.miaopp.pattern.abstractfactory;

/**
 * Created by miaoping on 16/11/3.
 */
public class PCProducer extends ComputerProducer {

    public Cpu createCpu() {
        return new PcCpu();
    }

    public Ram createRam() {
        return new PcRam();
    }

}
