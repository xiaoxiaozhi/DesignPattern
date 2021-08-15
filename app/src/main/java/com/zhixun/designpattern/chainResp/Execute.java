package com.zhixun.designpattern.chainResp;

/**
 * 请求:
 * 处理者:多个处理者根据请求属性，选择是自己处理还是送达到下一个处理者
 */
public class Execute {
    public static void main(String[] arg) {
        //创建一个请求
        Request request = new Request(100, 8000d);
        //创建处理者
        HandlerA handlerA = new HandlerA("handlerA");
        HandlerB handlerB = new HandlerB("handlerB");
        //处理者之间相互关联，形成环状，这样保证任何一个处理者接收请求到最后都能处理完
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerA);
        //任一处理者处理请求
        handlerA.handRequest(request);
    }
}
