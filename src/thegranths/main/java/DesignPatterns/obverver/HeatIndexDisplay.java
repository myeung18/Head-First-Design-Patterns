package DesignPatterns.obverver;

import DesignPatterns.obverver.type.Observer;

public class HeatIndexDisplay implements Observer {
    private WeatherData wdata;

    public HeatIndexDisplay(WeatherData wdata) {
        this.wdata = wdata;
        wdata.registerObserver(this);
    }

    @Override
    public void update(int d1, String d2, String d3) {

        System.out.println(d1 + ": "  + d2 + ":" + d3);
    }
}
