package com.beautyofdp.yh.factorypattern.parser.impl;

import com.beautyofdp.yh.factorypattern.RuleConfig;
import com.beautyofdp.yh.factorypattern.parser.IRuleConfigParser;

public class PropertiesRuleConfigParser implements IRuleConfigParser {

    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig();
    }

}
