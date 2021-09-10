package com.example.demo.rabbitmq;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * rabbitMq 配置类
 *
 */

@Configuration
public class RabbitConfig {


    @Resource
    private RabbitTemplate rabbitTemplate;

    /**
     * 交换机
     */
    @Bean
    public DirectExchange myDirectExchange() {
        // 参数意义:
        // name: 名称
        // durable: true
        // autoDelete: 自动删除
        return new DirectExchange("myDirectExchange", true, false);
    }

    /**
     * 队列
     */
    @Bean
    public Queue myDirectQueue() {

        return new Queue("myDirectQueue", true);
    }

    /**
     * 绑定
     */
    @Bean
    public Binding bindingDirect() {
        return BindingBuilder.bind(myDirectQueue())
                .to(myDirectExchange())
                .with("my.direct.routing");
    }
}
