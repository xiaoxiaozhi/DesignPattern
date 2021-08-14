package com.zhixun.designpattern.observer.observer1;

public class TempObserverImpl implements Observer {
    @Override
    public Enum<WeatherData.WeatherType> getType() {
        return WeatherData.WeatherType.TEMP;
    }

    @Override
    public void update(float data) {
        System.out.println("当前温度 = " + data);
    }
}
