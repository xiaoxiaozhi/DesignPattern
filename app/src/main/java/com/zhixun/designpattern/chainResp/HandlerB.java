package com.zhixun.designpattern.chainResp;

public class HandlerB extends Handler {
    public HandlerB(String name) {
        super(name);
    }

    @Override
    void handRequest(Request request) {
        if (request.getPrice() >= 5000 && request.getPrice() < 10000) {
            System.out.println("price = " + request.getPrice() + " " + name + "处理");
        } else {
            getNextHandler().handRequest(request);
        }
    }
}
