package com.zhixun.designpattern.observer;

public class ObserverImp implements Observer {
    @Override
    public void update(float temperature) {
        System.out.print("当前温度 = " + temperature);
    }
}
