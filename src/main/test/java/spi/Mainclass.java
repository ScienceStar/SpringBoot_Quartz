package spi;

import application.spi.intel.IParseDoc;
import application.spi.intel.impl.ExcelParse;
import application.spi.intel.impl.WordParse;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @ClassName Mainclass
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/22 12:32
 * @Version V1.0
 **/
public class Mainclass {
    public static void main(String[] args) {
        //耦合度很高！！！
        //实例化ExcelPase
        IParseDoc excelPase = new ExcelParse();
        excelPase.parse();
        //实例化WordParse
        IParseDoc wordParse = new WordParse();
        wordParse.parse();
        System.out.println("=============自然分割线============");


        //解耦灵活配置法
        testSpi1();
    }


    public static void testSpi1() {
        //把我们的接口类型保存到ServiceLoader中 service变量
        //创建了lazyIterator对象 （把我们的接口保存     保存我们的classLoader）
        ServiceLoader<IParseDoc> load = ServiceLoader.load(IParseDoc.class);
        Iterator<IParseDoc> iterator = load.iterator();


        //或者Service.providers()方法获取我们的Iterator对象
        //Iterator<IParseDoc> iterator = Service.providers(IParseDoc.class);
        //循环获取所需的对象
        while (iterator.hasNext()) {
            IParseDoc next = iterator.next();
            next.parse();
        }
    }
}
