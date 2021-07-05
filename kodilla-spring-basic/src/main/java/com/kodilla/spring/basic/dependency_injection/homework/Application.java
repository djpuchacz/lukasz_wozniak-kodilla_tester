package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryInterface deliveryInterface = new DeliveryService();
        NotificationInterface notificationInterface = new NotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryInterface, notificationInterface);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}