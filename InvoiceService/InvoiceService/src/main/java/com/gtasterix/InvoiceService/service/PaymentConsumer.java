package com.gtasterix.InvoiceService.service;

import com.gtasterix.InvoiceService.model.Payment;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentConsumer {

    @KafkaListener(topics = "${spring.kafka.topic.payment}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(Payment payment) {
        System.out.println("Received Payment: " + payment);
    }
}
