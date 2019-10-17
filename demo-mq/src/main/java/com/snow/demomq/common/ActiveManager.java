package com.snow.demomq.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;
@Component
public class ActiveManager {

    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate;


    /**
     * @param data
     * @desc 即时发送
     */
    public void send(Destination destination, String data) {
        this.jmsMessagingTemplate.convertAndSend(destination, data);
    }
}
