package com.example.demo.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Producer {

    @Resource
    private RabbitTemplate rabbitTemplate;

    /**
     * 给hello队列发送消息
     */
    public void send() {
        /**
        for (int i = 0; i < 10; i++) {
            String msg = "hello, 序号: " + i;
            System.out.println("Producer, " + msg);
            rabbitTemplate.convertAndSend("myDirectExchange", "my.direct.routing", msg);
        }**/
        String msg = "hello";
        System.out.println("Producer, " + msg);
        rabbitTemplate.convertAndSend("myDirectExchange", "my.direct.routing", msg);
    }

}
