package com.zhixun.designpattern.observer.observer1;

public class Execute {
    public static void main(String[] arg) {
        WeatherData weatherData = new WeatherData();
        weatherData.register(new HunObserverImpl());
        weatherData.register(new TempObserverImpl());
        weatherData.setHumidity(20);
        weatherData.setTemperature(30);
    }
}
