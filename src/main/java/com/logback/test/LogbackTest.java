package com.logback.test;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Ivan on 2016/6/29.
 */
public class LogbackTest {
    private static final Logger logger= LoggerFactory.getLogger(LogbackTest.class);

    public static void main(String[] args){

        for (int i=0;i<10000;i++){
            logger.info("{}",i);
            logger.error("");
            logger.debug("");
            logger.trace("");
            logger.warn("");

        }
    }
//        if(logger.isDebugEnabled()){
//            logger.debug("slf4j-logback debug message");
//        }
//        if(logger.isInfoEnabled()){
//            logger.debug("slf4j-logback info message");
//        }
//        if(logger.isTraceEnabled()){
//            logger.debug("slf4j-logback trace message");
//        }
//
//        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
//        StatusPrinter.print(lc);
//    }
}
