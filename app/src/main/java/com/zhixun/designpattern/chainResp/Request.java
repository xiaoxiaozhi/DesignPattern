package com.zhixun.designpattern.chainResp;

public class Request {
    private int  num;
    private double  price;

    public Request(int num, double price) {
        this.num = num;
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public double getPrice() {
        return price;
    }

}
