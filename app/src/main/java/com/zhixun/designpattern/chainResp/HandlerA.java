package com.zhixun.designpattern.chainResp;

public class HandlerA extends Handler {
    public HandlerA(String name) {
        super(name);
    }

    @Override
    void handRequest(Request request) {
        if (request.getPrice() >= 3000 && request.getPrice() < 5000) {
            System.out.println("price = " + request.getPrice() + " " + name + "处理");
        } else {
            getNextHandler().handRequest(request);
        }
    }
}
