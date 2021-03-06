package com.mtit.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;

// Logging Class
public class Log {
    final static Logger logger = Logger.getRootLogger();

    /**
     * Write a log through file stream to sysout.log
     * @param message
     */
    public void writeToLog(String message) {
        PropertyConfigurator.configure("src/main/java/com/mtit/logger/log4j.properties");
        logger.info(message);
        System.out.println(message);
    }
}
