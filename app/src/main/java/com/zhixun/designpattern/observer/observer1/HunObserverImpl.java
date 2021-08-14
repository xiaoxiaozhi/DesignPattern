package com.zhixun.designpattern.observer.observer1;

public class HunObserverImpl implements Observer {
    @Override
    public Enum<WeatherData.WeatherType> getType() {
        return WeatherData.WeatherType.HUM;
    }

    @Override
    public void update(float data) {
        System.out.println("当前湿度 = "+data);
    }
}
