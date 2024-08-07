package com.gtasterix.KafkaPaymentService.service;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Value("${spring.kafka.topic.payment}")
    private String paymentTopicName;

    @Bean
    public NewTopic paymentTopic() {
        return TopicBuilder.name(paymentTopicName)
                .build();
    }
}
