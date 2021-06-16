package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Order item1 = new Order("item1");
        Order item2 = new Order("item2");
        Order item3 = new Order("item3");
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(item1);
        warehouse.addOrder(item2);
        warehouse.addOrder(item3);

        //doesOrderExist("item3", warehouse);
        doesOrderExist("item9", warehouse);
    }
    private static void doesOrderExist (String orderNumber, Warehouse warehouse){
        try {
            Order order = warehouse.getOrder(orderNumber);
            System.out.println("Znaleziono zamówienie numer: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Zamówienie numer: " + orderNumber + " nie istnieje");
        }
    }

}

