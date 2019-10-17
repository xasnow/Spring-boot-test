package com.snow.demomq.rest;

import com.snow.demomq.common.ActiveManager;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;
@RestController
@RequestMapping(value = "/test/producer", produces = "application/json")
public class ProducerRest {
    /**
     * 注入ActiveManager
     */
    @Autowired
    ActiveManager activeManager;

    /**
     * 新增消息队列
     */
    @RequestMapping(value = "/add/queue", method = RequestMethod.GET)
    public void addQueue() {
        Destination destination = new ActiveMQQueue("Queue1");
        //传入队列以及值
        for (int i = 0; i < 10; i++) {
            activeManager.send(destination, "传入队列的值为： " + i);
        }

    }
}
