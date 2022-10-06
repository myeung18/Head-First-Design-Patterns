package aws.logging;

public class FileLogger implements LogObserver {
    @Override
    public void log(String msg) {
        System.out.println("writing to file " + msg);
    }
}
