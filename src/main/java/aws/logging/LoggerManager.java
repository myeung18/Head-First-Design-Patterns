package aws.logging;

public class LoggerManager {

    static LoggerSubject addLogObservers() {
        LoggerSubject sub = new LoggerSubject();
        FileLogger flog = new FileLogger();
        sub.addLogObserver(1, flog);
        sub.addLogObserver(2, flog);

        return sub;
    }

    static AbstractLogger buildChaining() {
        AbstractLogger infolog = new InfoLogger(1);
        AbstractLogger errlog = new ErrorLogger(2);

        infolog.setNextLevelLogger(errlog);

        return infolog;
    }
}
