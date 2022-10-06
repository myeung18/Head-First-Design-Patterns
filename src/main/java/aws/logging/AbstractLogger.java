package aws.logging;

public abstract class AbstractLogger {
    int levels;
    private AbstractLogger nextLevelLogger;

    void logMessage(int level, String msg, LoggerSubject loggerSubject) {
        if (this.levels == level) {
            display(msg, loggerSubject);
        }
        if (nextLevelLogger != null) {
            nextLevelLogger.logMessage(level, msg, loggerSubject);
        }
    }

    public void setNextLevelLogger(AbstractLogger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }

    public abstract void display(String msg, LoggerSubject loggerSubject);
}
