package application.spi.intel.impl;

import application.spi.intel.SpiDemo;

/**
 * @ClassName SpiDemoImpl1
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/22 12:42
 * @Version V1.0
 **/
public class SpiDemoImpl1 implements SpiDemo {
    @Override
    public void say() {
        System.out.println("SpiDemoImpl1");
    }
}
