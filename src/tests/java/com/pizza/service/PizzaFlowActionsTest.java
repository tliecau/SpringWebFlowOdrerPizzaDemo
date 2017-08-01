package com.pizza.service;

import com.pizza.domain.Customer;
import com.pizza.domain.CustomerRepository;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

public class PizzaFlowActionsTest {

    @Test(expected = CustomerNotFoundException.class)
    public void lookupCustomerNotExistingCutomer() throws Exception {
        CustomerRepository customerRepository = mock(CustomerRepository.class);
        PizzaFlowActions pizzaFlowActions = new PizzaFlowActions(customerRepository);
        pizzaFlowActions.lookupCustomer("5");
    }

    @Test
    public void lookupCustomerExistingCutomer() throws Exception {
        Set<Customer> mockCustomers = new HashSet<>();
        Customer testedCustomer = new Customer("123", "456", "789");
        mockCustomers.add(testedCustomer);

        CustomerRepository customerRepository = mock(CustomerRepository.class);
        when(customerRepository.getCustomers()).thenReturn(mockCustomers);

        PizzaFlowActions pizzaFlowActions = new PizzaFlowActions(customerRepository);
        Customer customer = pizzaFlowActions.lookupCustomer(new String ("123"));
        assertEquals(customer, testedCustomer);
    }

    @Test
    public void addCustomer() throws Exception {
        CustomerRepository customerRepository = mock(CustomerRepository.class);
        PizzaFlowActions pizzaFlowActions = new PizzaFlowActions(customerRepository);
        Customer testedCustomer = new Customer("123", "456", "789");
        pizzaFlowActions.addCustomer(testedCustomer);
        verify(customerRepository, times(1)).addCustomer(testedCustomer);
    }
}