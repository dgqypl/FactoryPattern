package com.beautyofdp.yh.factorypattern.abstractfactory;

import com.beautyofdp.yh.factorypattern.parser.IRuleConfigParser;
import com.beautyofdp.yh.factorypattern.parser.ISystemConfigParser;
import com.beautyofdp.yh.factorypattern.parser.impl.XmlRuleConfigParser;
import com.beautyofdp.yh.factorypattern.parser.impl.XmlSystemConfigParser;

public class XmlConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new XmlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new XmlSystemConfigParser();
    }
    // 省略YamlConfigParserFactory和PropertiesConfigParserFactory代码
}
