package com.zhixun.designpattern.chainResp;

public abstract class Handler {

    public String name;
    private Handler nextHandler;


    public Handler(String name) {
        this.name = name;
    }

    //下一个处理者
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    //处理方法
    abstract void handRequest(Request request);
}
