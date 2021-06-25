package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    double orderValue;
    LocalDate orderDate;
    String orderBy; //login osoby dokonującej zamówienia
    //= LocalDate.of(2019, 11, 20);

    public Order(double orderValue, LocalDate orderDate, String orderBy) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.orderBy = orderBy;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getOrderBy() {
        return orderBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.orderValue, orderValue) == 0 && Objects.equals(orderDate, order.orderDate) && Objects.equals(orderBy, order.orderBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderValue, orderDate, orderBy);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", orderDate=" + orderDate +
                ", orderBy='" + orderBy + '\'' +
                '}';
    }

}
