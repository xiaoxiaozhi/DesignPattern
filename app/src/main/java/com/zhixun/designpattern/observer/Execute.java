package com.zhixun.designpattern.observer;

/**
 * 观察者模式：观察者+事件处理+业务流程
 * <p>
 * 观察者:Observer
 * 事件处理---->Subject 观察者的注册、移除、事件更新
 * 被观察者：Subject 实现具体业务逻辑，继承事件处理，有数据的时候调用subject的通知方法，通知观察者
 */
public class Execute {
    public static void main(String[] arg) {
        WeatherData weather = new WeatherData();
        weather.register(new ObserverImp());
        weather.setTemperature(10);
    }
}
