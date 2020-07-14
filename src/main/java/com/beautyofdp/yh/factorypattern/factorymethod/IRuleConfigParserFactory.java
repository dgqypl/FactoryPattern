package com.beautyofdp.yh.factorypattern.factorymethod;

import com.beautyofdp.yh.factorypattern.parser.IRuleConfigParser;

public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
