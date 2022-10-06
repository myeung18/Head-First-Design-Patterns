package aws.logging;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoggerSubject {
    //level to different logger
    Map<Integer, List<LogObserver>> logObservers = new HashMap<>();
    void addLogObserver(int level, LogObserver logObserver) {
        logObservers.computeIfAbsent(level, k -> new ArrayList<>()).add(logObserver);
    }

    void removeLogger(LogObserver logObserver) {
        for (var ent : logObservers.entrySet()) {
            ent.getValue().remove(logObserver);
        }
    }

    void notifyLogObservers(int level, String msg) {
        for (var ent : logObservers.entrySet()) {
            if (ent.getKey() == level) {
                ent.getValue().forEach(log -> log.log(msg));
            }
        }
    }
}
