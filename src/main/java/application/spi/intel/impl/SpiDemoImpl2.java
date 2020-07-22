package application.spi.intel.impl;

import application.spi.intel.SpiDemo;

/**
 * @ClassName SpiDemoImpl2
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/22 12:45
 * @Version V1.0
 **/
public class SpiDemoImpl2 implements SpiDemo {
    @Override
    public void say() {
        System.out.println("The second impl");
    }
}
