package com.beautyofdp.yh.factorypattern.parser;

import com.beautyofdp.yh.factorypattern.RuleConfig;

public interface IRuleConfigParser {

    RuleConfig parse(String configText);

}
