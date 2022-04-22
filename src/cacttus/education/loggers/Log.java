package cacttus.education.loggers;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {
    private Logger logger;

    public Log() {
        logger = Logger.getLogger(Log.class.getName());
    }

    public Log(String logName) {
        logger = Logger.getLogger(logName);
    }

    public Log(String logName, Level level) {
        this(logName);
        logger.setLevel(level);
    }

    public Log(String logName, Level level, String fileName) throws IOException {
        this(logName, level);
        FileHandler handler = new FileHandler(fileName);
        logger.addHandler(handler);
    }

    public Log(String logName, Level level, String fileName, Formatter formatter) throws IOException {
        this(logName, level);
        FileHandler handler = new FileHandler(fileName);
        handler.setFormatter(formatter);
        logger.addHandler(handler);
    }


    public void add(String logMessage, Level level) {
        logger.log(level, logMessage);
    }


}








