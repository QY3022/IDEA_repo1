package com.gyf.logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class getLog {
    Log log = LogFactory.getLog(this.getClass());

    public void LogTest(){
        log.debug("debug");
        log.info("我是info");
    }

    public static void main(String[] args) {
        getLog g = new getLog();
        g.LogTest();
    }
}
