package application.spi.intel.impl;

import application.spi.intel.IParseDoc;

/**
 * @ClassName WordParse
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/22 12:04
 * @Version V1.0
 **/
public class WordParse implements IParseDoc {
    @Override
    public void parse() {
        System.out.println("Word 解析！");
    }
}
