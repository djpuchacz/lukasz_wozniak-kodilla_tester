package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {
    private DeliveryInterface deliveryInterface;
    private NotificationInterface notificationInterface;

    public ShippingCenter(DeliveryInterface deliveryInterface, NotificationInterface notificationInterface) {
        this.deliveryInterface = deliveryInterface;
        this.notificationInterface = notificationInterface;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryInterface.deliverPackage(address, weight)) {
            notificationInterface.success(address);
        } else {
            notificationInterface.fail(address);
        }
    }
}
