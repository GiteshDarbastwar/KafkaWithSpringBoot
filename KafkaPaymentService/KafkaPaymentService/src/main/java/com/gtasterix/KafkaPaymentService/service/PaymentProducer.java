    package com.gtasterix.KafkaPaymentService.service;

    import com.gtasterix.KafkaPaymentService.model.Payment;
    import org.springframework.beans.factory.annotation.Value;
    import org.springframework.kafka.core.KafkaTemplate;
    import org.springframework.stereotype.Service;

    @Service
    public class PaymentProducer {

        private final KafkaTemplate<String, Payment> kafkaTemplate;
        private final String topic;

        public PaymentProducer(KafkaTemplate<String, Payment> kafkaTemplate,
                               @Value("${spring.kafka.topic.payment}") String topic) {
            this.kafkaTemplate = kafkaTemplate;
            this.topic = topic;
        }

        public void sendPayment(Payment payment) {
            kafkaTemplate.send(topic, payment);
        }
    }
