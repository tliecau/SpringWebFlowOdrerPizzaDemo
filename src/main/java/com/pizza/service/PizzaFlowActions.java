package com.pizza.service;

import com.pizza.domain.Customer;
import com.pizza.domain.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PizzaFlowActions {
    private CustomerRepository customerRepository;

    public PizzaFlowActions(@Autowired CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
        Optional<Customer> customer = customerRepository.getCustomers().stream()
                .filter(existingCustomer -> existingCustomer.getPhoneNumber().equals(phoneNumber))
                .findFirst();
        if (!customer.isPresent()) {
            throw new CustomerNotFoundException();
        }
        return customer.get();
    }

    public boolean checkDeliveryArea(String zipcode) {
        return zipcode.contains("80");
    }

    public void addCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }
}
