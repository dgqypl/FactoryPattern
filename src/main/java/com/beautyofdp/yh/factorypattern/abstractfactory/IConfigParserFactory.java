package com.beautyofdp.yh.factorypattern.abstractfactory;

import com.beautyofdp.yh.factorypattern.parser.IRuleConfigParser;
import com.beautyofdp.yh.factorypattern.parser.ISystemConfigParser;

public interface IConfigParserFactory {
    IRuleConfigParser createRuleParser();

    ISystemConfigParser createSystemParser();
    //此处可以扩展新的parser类型，比如IBizConfigParser
}
