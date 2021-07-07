package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShippingCenter {
    @Autowired

    private DeliveryInterface deliveryInterface;
    @Autowired

    private NotificationInterface notificationInterface;

        // tutaj dodaj odpowiednie wstrzykiwanie zależności

    public String sendPackage(String address, double weight) {
        if (deliveryInterface.deliverPackage(address, weight)) {
            return notificationInterface.success(address);
        }
        return notificationInterface.fail(address);
    }
}