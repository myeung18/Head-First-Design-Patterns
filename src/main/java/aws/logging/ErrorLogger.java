package aws.logging;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.levels = level;
    }

    @Override
    public void display(String msg, LoggerSubject loggerSubject) {
        loggerSubject.notifyLogObservers(2, "ERROR : " + msg);
    }
}
