package com.example.testaar;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import java.util.HashMap;
import java.util.Map;

public class Log4oFactory implements ILoggerFactory {
    private Map<String, Log4o> loggerMap;

    public Log4oFactory() {
        loggerMap = new HashMap<String, Log4o>();
    }

    @Override
    public Logger getLogger(String name) {
        synchronized (loggerMap) {
            if (!loggerMap.containsKey(name)) {
                loggerMap.put(name, new Log4o(name));
            }
            return loggerMap.get(name);
        }
    }
}