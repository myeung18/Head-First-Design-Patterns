package aws.logging;


/***
 * wire LogSubject and Logger together.
 */
public class Logger {

    private volatile static LoggerSubject loggerSubject;
    private volatile static AbstractLogger chainLogger;
    private volatile static Logger logger;

    private Logger() {
    }

    public static Logger getLogger() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                    loggerSubject = LoggerManager.addLogObservers();
                    chainLogger = LoggerManager.buildChaining();
                }
            }
        }
        return logger;
    }

    /**
     * client method.
     */
    public void info(String msg) {
        createLog(1, msg);
    }
    public void error(String msg) {
        createLog(2, msg);
    }

    private void createLog(int level, String msg) {
        chainLogger.logMessage(level, msg, loggerSubject);

    }
}
