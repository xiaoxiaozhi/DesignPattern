package com.zhixun.designpattern.observer.observer1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 事件管理
 * 订阅 取消 通知
 */
public class SubjectServer {

    public enum WeatherType {
        TEMP, HUM;
    }

    public HashMap<Enum<WeatherType>, Set<Observer>> hashMap = new HashMap<>();

    public SubjectServer() {
        for (WeatherType type : WeatherType.values()) {
            hashMap.put(type, new HashSet<>());
        }
    }

    public void register(Observer observer) {
        hashMap.get(observer.getType()).add(observer);
    }


    public void removeRegister(Observer observer) {
        hashMap.get(observer.getType()).remove(observer);
    }


    public void notifyObservers(Enum entype, int data) {
        for (Observer observe : hashMap.get(entype)) {
            observe.update(data);
        }
    }

}
