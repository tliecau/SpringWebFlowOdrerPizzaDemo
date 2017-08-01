package com.pizza.service;

import com.pizza.domain.Customer;
import org.springframework.stereotype.Component;

@Component
public class PizzaFlowActions {
    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
        if (!phoneNumber.equals("123")) {
            throw new CustomerNotFoundException();
        }
        return new Customer(phoneNumber, "80-800", "Jon Doe");
    }

    public boolean checkDeliveryArea(String zipcode) {
        return true;
    }

    public void addCustomer(Customer customer) {

    }
}
