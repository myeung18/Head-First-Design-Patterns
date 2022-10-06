package DesignPatterns.obverver.type;

public interface Subject {
    void registerObserver(Observer o);
    void notifyObservers();
}
