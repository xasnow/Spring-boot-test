package com.snow.demomq.rest;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class CustomerRest {

    @JmsListener(destination = "Queue1")
    public void getQueue(String info) {
        System.out.println("成功监听Queue1 消息队列，传来的值为:" + info);
    }
}
