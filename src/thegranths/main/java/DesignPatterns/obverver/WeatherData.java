package DesignPatterns.obverver;

import DesignPatterns.obverver.type.Observer;
import DesignPatterns.obverver.type.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void setData() {
        dataChanged();
    }

    public void dataChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(-1, "test", "test");
        }
    }
}
