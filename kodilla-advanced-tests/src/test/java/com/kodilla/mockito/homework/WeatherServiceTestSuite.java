package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.management.Notification;
import javax.xml.stream.Location;
import java.util.HashSet;
import java.util.Set;

public class WeatherServiceTestSuite {
    WeatherService weatherService = new WeatherService();
    Client client = Mockito.mock(Client.class);
    Location location = Mockito.mock(Location.class);
    Notification Notification = Mockito.mock(Notification.class);


    @Test
    public void notSubscribedPersonShouldNotReceiveNotifications() {
        weatherService.addLocation(location);
        weatherService.sendNotificationToLocation(Notification, location);
        Mockito.verify(client, Mockito.never()).receive(Notification);
    }

    @Test
    public void subscriberShouldReceiveNotificationFromLocationToWitchHeIsSubscribed() {


    }

    @Test
    public void subscriberShouldBeAbleToCancelSubscriptionToLocation() {

    }

    @Test
    public void shouldRemoveAllSubscriptions() {

    }

    @Test
    public void shouldSentNotificationOnlyToSubscribesSubscribedToLocation() {

    }

    @Test
    public void shouldSentNotificationToAllSubscribers() {

    }

    @Test
    public void shouldRemoveLocationForAllSubscribers() {

    }
}