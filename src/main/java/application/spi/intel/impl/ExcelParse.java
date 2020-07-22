package application.spi.intel.impl;

import application.spi.intel.IParseDoc;

/**
 * @ClassName ExcelPase
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/22 12:03
 * @Version V1.0
 **/
public class ExcelParse implements IParseDoc {
    @Override
    public void parse() {
        System.out.println("Excel 解析!");
    }
}
