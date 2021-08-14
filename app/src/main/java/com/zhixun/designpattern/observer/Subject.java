package com.zhixun.designpattern.observer;

/**
 * 订阅 取消 通知
 *
 * @param <T>
 */
public interface Subject<T> {

    public void register(T observer);

    public void removeRegister(T observer);

    public void notifyObservers();

}
