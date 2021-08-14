package com.zhixun.designpattern.observer;

import java.util.HashSet;
import java.util.Set;

//业务逻辑 + 事件处理 ( 实际需求中 事件类型并不单一)参照 observer1.WeatherData
public class WeatherData implements Subject<Observer> {
    private int temperature;

    private Set<Observer> observerList;

    public WeatherData() {
        observerList = new HashSet<>();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeRegister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature);
        }
    }
}
