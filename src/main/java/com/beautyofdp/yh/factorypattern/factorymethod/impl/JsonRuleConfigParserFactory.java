package com.beautyofdp.yh.factorypattern.factorymethod.impl;

import com.beautyofdp.yh.factorypattern.factorymethod.IRuleConfigParserFactory;
import com.beautyofdp.yh.factorypattern.parser.IRuleConfigParser;
import com.beautyofdp.yh.factorypattern.parser.impl.JsonRuleConfigParser;

public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
