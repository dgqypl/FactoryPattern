package com.beautyofdp.yh.factorypattern.abstractfactory;

import com.beautyofdp.yh.factorypattern.parser.IRuleConfigParser;
import com.beautyofdp.yh.factorypattern.parser.ISystemConfigParser;
import com.beautyofdp.yh.factorypattern.parser.impl.JsonRuleConfigParser;
import com.beautyofdp.yh.factorypattern.parser.impl.JsonSystemConfigParser;

public class JsonConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}
