package com.gtasterix.KafkaPaymentService.service;

import com.gtasterix.KafkaPaymentService.model.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private  final PaymentProducer paymentProducer;

    public PaymentService(PaymentProducer paymentProducer) {
        this.paymentProducer = paymentProducer;
    }
    public void processPayment(Payment payment) {

        paymentProducer.sendPayment(payment);
    }
}
