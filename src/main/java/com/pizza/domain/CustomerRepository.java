package com.pizza.domain;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Component
public class CustomerRepository {

    Set<Customer> customers = new HashSet<>();

    public Set<Customer> getCustomers() {
        return Collections.unmodifiableSet(customers);
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }
}
