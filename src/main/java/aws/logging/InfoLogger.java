package aws.logging;

public class InfoLogger extends AbstractLogger {
    InfoLogger(int level) {
        this.levels = level;
    }

    @Override
    public void display(String msg, LoggerSubject loggerSubject) {
        loggerSubject.notifyLogObservers(1, "INFO : " + msg);

    }
}
