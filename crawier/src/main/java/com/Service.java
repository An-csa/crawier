package com;

import javax.jms.JMSException;

/**
 * @author An
 */
public interface Service {
    void  sendMessage(String message) throws JMSException;

    String reciveMessage() throws JMSException;

}
