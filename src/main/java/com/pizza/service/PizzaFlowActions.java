package com.pizza.service;

import com.pizza.domain.Customer;
import com.pizza.domain.CustomerRepository;
import com.pizza.domain.Order;
import com.pizza.domain.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

@Component
public class PizzaFlowActions {
    private CustomerRepository customerRepository;
    private Queue<Order> orders = new LinkedList<>();

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

    public Payment verifyPayment(Payment payment) { return payment; }

    public void saveOrder(Order order) { orders.add(order); }
}
