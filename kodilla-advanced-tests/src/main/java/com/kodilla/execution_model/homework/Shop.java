package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shop {
    private Set<Order> orders =new HashSet<>();

    public static void main(String[] args) throws IncorrectOrderException, IncorrectDateException{


        Shop shop = new Shop();
        Order order1 = new Order(100, LocalDate.of(2019, 01, 20), "john123");
        Order order2 = new Order(201, LocalDate.of(2017, 02, 11), "adam123");
        Order order3 = new Order(300, LocalDate.of(2018, 01, 03), "john123");
        Order order4 = new Order(100, LocalDate.of(2019, 01, 20), "john123"); // duplicated order, won't be added

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);

        LocalDate initialDate = LocalDate.of(2020, 01, 01);
        LocalDate finishDate = LocalDate.of(2021, 06, 01);
        List<Order> ordersFound = shop.orderListBasedOnRangeOfDates(initialDate, finishDate);
        System.out.println("Lista zamówień z podanego okresu : " + ordersFound);

        System.out.println("Ordes count: " + shop.numberOfTotalOrders());
        System.out.println("Total shop orders value: " + shop.sumOFOrdersValue());

        List<Order> ordersWithinSpecifiedvalues = shop.getOrdersBetweenAmounts(100, 202);
        System.out.println("Orders with values between 100 and 2002 : " + ordersWithinSpecifiedvalues);

    }
    //dodanie nowego zamówienia:
    public void addOrder(Order order) throws IncorrectOrderException {
        if(order.getOrderValue() >= 0 && order.getOrderBy() != null && order.getOrderBy() != "" && order.getOrderDate() != null){
            if(order.getOrderDate().getYear() > 1940 && order.getOrderDate().getYear() <= LocalDate.now().getYear() ){
                this.orders.add(order);
            } else {
                throw new IncorrectOrderException("Incorrect order date");
            }
        } else {
            throw new IncorrectOrderException("Incorrect order details");
        }

    }

    //zwrócenie listy zamówień z zakresu dwóch dat:
    public List<Order> orderListBasedOnRangeOfDates(LocalDate initialDate, LocalDate finishDate) throws IncorrectDateException {
        if (finishDate.isBefore(initialDate)) {
            throw new IncorrectDateException("End date must be after start date");
        }
        if(orders.size()>0) {
            List<Order> filteredOrders = new ArrayList<>();
            for(Order order: orders){
                if(initialDate.compareTo(order.getOrderDate()) * order.getOrderDate().compareTo(finishDate) >= 0 ){
                filteredOrders.add(order);
            }
        }
        return filteredOrders;
        }
        return null;
    }


    //pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia),
    public List<Order> getOrdersBetweenAmounts(double min, double max) {
        if(orders.size() ==0)
            return null;
        List<Order> filteredOrders = new ArrayList<>();
        for(Order order: orders){
            if(order.getOrderValue() >= min && order.getOrderValue() <= max)
                filteredOrders.add(order);
        }
        return filteredOrders;
    }



    //zwrócenie liczby zamówień:
    public int numberOfTotalOrders () {
        return orders.size();
    }

    //zsumowanie wartości wszystkich zamówień:
    public double sumOFOrdersValue() {
        if(orders.size() == 0)
            return 0;
        double sum = 0;
        for(Order order: orders){
            sum += order.getOrderValue();
        }
        return sum;

    }

    public Set<Order> getOrders() {
        return orders;
    }


}
