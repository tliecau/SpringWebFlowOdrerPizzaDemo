package com.pizza.domain;

import java.io.Serializable;
import java.util.List;

public class Pizza implements Serializable {
    private String size;
    private List<Topping> toppings;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}
