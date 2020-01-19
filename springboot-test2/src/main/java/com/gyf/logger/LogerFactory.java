package com.gyf.logger;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogerFactory {
    final Logger log = LoggerFactory.getLogger(this.getClass());
//    这里的这句话是导入log4j的配置文件
//    PropertyConfigurator.configure("config/log4j.properties);
    public void testLogger(){
        log.info("info");
        log.debug("debug");
        log.error("error");
        log.warn("warn");
    }

    public static void main(String[] args) {
        LogerFactory l = new LogerFactory();
        l.testLogger();
    }
}
