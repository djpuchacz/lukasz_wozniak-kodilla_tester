package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ShippingCenterTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
    DeliveryInterface dbean = context.getBean(DeliveryService.class);
    NotificationInterface nbean = context.getBean(NotificationService.class);
    ShippingCenter sbean = context.getBean(ShippingCenter.class);
    String success = nbean.success("Strasse");
    String fail = nbean.fail("Avenue");

    @Test
    public void shouldDeliverPackageCorrectWeight() {
        boolean result = dbean.deliverPackage("Strasse", 9.5);
        assertTrue(result);
    }

    @Test
    public void shouldNotDeliverPackageOverWeight() {
        boolean result = dbean.deliverPackage("Avenue", 30.01);
        assertFalse(result);
    }

    @Test
    public void shouldShowSuccessNotificationIfPackageParameterOk() {
        String result = sbean.sendPackage("Strasse", 9.5);
        assertEquals(success, result);
    }

    @Test
    public void shouldShowFailNotificationIfPackageParameterNotOk() {
        String result = sbean.sendPackage("Avenue", 31.0);
        assertEquals(fail, result);
    }

}
