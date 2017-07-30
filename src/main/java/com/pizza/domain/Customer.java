package com.pizza.domain;

import java.io.Serializable;

public class Customer implements Serializable{
    private String phoneNumber;
    private String zipCode;
    private String name;

    public Customer() {
    }

    public Customer(String phoneNumber, String zipCode, String name) {
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
