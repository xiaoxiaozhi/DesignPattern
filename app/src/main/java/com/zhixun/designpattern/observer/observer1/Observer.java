package com.zhixun.designpattern.observer.observer1;

/**
 * 观察者
 */
public interface Observer {
    Enum<WeatherData.WeatherType> getType();

    void update(float temperature);
}
