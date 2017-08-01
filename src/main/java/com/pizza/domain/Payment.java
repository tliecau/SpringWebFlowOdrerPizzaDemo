package com.pizza.domain;

import java.io.Serializable;

public class Payment implements Serializable {
    private PaymentType paymentType;

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
