package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * @author An
 */
public class ServiceImpl implements Service {
    @Autowired
    private JmsTemplate jmsTemplatel;

    @Override
    public void sendMessage(String message) throws JMSException {
        jmsTemplatel.send(session -> session.createTextMessage(message));
    }

    @Override
    public String reciveMessage() throws JMSException {
     Message message= jmsTemplatel.receive() ;
    return message instanceof TextMessage ?((TextMessage) message).getText():"";
    }
}
