package com.zhixun.designpattern.observer.observer1;

import java.util.HashMap;

//业务逻辑抽象层：观察者管理 + 业务逻辑定义更具体的业务逻辑由子类实现
public class WeatherData extends SubjectServer {


    private int temperature;
    private int humidity;

    public WeatherData() {

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers(SubjectServer.WeatherType.TEMP, this.temperature);
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyObservers(SubjectServer.WeatherType.HUM, this.humidity);
    }
}
