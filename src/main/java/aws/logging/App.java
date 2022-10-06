package aws.logging;

public class App {
    public static void main(String[] args) {
        Logger log = Logger.getLogger();
        log.info("info log go. ");
        log.error("ERR: info log go. ");
    }
}
