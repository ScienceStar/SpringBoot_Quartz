package spi;

import application.spi.intel.IParseDoc;
import application.spi.intel.SpiDemo;
import org.junit.Test;

import java.util.ServiceLoader;

/**
 * @ClassName SpiTest
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/22 12:24
 * @Version V1.0
 **/
public class SpiTest {

    @Test
    public void testSpi(){
        ServiceLoader<IParseDoc> serviceLoader = ServiceLoader.load(IParseDoc.class);
        ServiceLoader<SpiDemo> spiLoad = ServiceLoader.load(SpiDemo.class);
        System.out.println("java SPI");
        serviceLoader.forEach(IParseDoc::parse);
        System.out.println("-----------------------------");
        spiLoad.forEach(SpiDemo::say);
    }
}
