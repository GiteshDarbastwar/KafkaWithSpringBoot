package com.gtasterix.KafkaPaymentService.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Payment {

    private String id;
    private double amount;
}
