package com.kodilla.exception.homework;
import java.util.ArrayList;
import java.util.List;


public class Warehouse {
    public List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
   }

   public Order getOrder(String number) throws OrderDoesntExistException {
                return orders
                .stream()
                .filter(u->u.getNumber().equals(number))
                .findFirst() // metoda findFirst zwraca pierwszy element z przetworzonego strumienia – zwykle spełniający jakieś warunki określone w metodzie filter.
                .orElseThrow(()->new OrderDoesntExistException());

    }
}

