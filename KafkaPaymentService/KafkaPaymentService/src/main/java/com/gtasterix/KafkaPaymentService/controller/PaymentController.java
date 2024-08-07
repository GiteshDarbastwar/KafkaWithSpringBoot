package com.gtasterix.KafkaPaymentService.controller;


import com.gtasterix.KafkaPaymentService.model.Payment;
import com.gtasterix.KafkaPaymentService.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payments")
    public String createPayment(@RequestBody Payment payment) {
        paymentService.processPayment(payment);
        return "Payment Successful:"+payment;
    }
}
