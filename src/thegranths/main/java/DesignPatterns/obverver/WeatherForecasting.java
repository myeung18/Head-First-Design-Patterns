package DesignPatterns.obverver;

public class WeatherForecasting {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        HeatIndexDisplay hd = new HeatIndexDisplay(wd);
        CurrentDisplay cd = new CurrentDisplay(wd);

        wd.setData();
    }
}
