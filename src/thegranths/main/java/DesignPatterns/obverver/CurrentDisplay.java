package DesignPatterns.obverver;

import DesignPatterns.obverver.type.Observer;

public class CurrentDisplay implements Observer {
    private WeatherData wd;

    public CurrentDisplay(WeatherData wd) {
        this.wd = wd;
        wd.registerObserver(this);
    }

    @Override
    public void update(int d1, String d2, String d3) {
        System.out.println(CurrentDisplay.class.getName() + " : " + d1 + ": "  + d2 + ":" + d3);
    }
}
