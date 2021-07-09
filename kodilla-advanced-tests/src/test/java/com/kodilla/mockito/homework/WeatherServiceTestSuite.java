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
    Notification notification = Mockito.mock(Notification.class);

    @BeforeEach
    public void starterInput() {
        weatherService.addSubscriber(client, location);
    }

    @Test
    public void newSubscriberShouldBeSubscribedToLocationAndReceiveNotification() {
        weatherService.sendNotificationToLocation(location, notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void notSubscribedToLocationShouldNotReceiveNotification() {
        Location location2 = Mockito.mock(Location.class);
        Client client2 = Mockito.mock(Client.class);
        Client client3 = Mockito.mock(Client.class);
        weatherService.addSubscriber(client2, location2);
        weatherService.addSubscriber(client3, location);
        weatherService.sendNotificationToLocation(location, notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.never()).receive(notification);
        Mockito.verify(client3, Mockito.times(1)).receive(notification);
    }


    @Test
    public void clientShouldBeAbleToCancelSubscriptionFromExistingLocation() {
        weatherService.removeSubscriptionFromLocation(client, location);
        weatherService.sendNotificationToLocation(location, notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }


    @Test //wycofanie subskrypcji z niezabskrybowanej lokalizacji
    public void clientShouldNotBeAbleToCancelSubscriptionFromNotSubscribedLocation() {
            Location location4 = Mockito.mock(Location.class);
            weatherService.removeSubscriptionFromLocation(client, location4);
            Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void clientShouldBeAbleToCancelSubscriptionFromAllLocations() {
        Location location2 = Mockito.mock(Location.class);
        Location location3 = Mockito.mock(Location.class);
        weatherService.addSubscriber(client, location2);
        weatherService.addSubscriber(client, location3);
        weatherService.removeAllSubscriptions(client);
        weatherService.sendNotificationToLocation(location, notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    //dwóch klientów w dwóch różnych lokalizacjach otrzymują powiadomienia
    @Test
    public void shouldDifferentClientsInDifferentLocalisationReceivedNotifications() {
        Client client2 = Mockito.mock(Client.class);
        Location location2 = Mockito.mock(Location.class);
        weatherService.addSubscriber(client2, location2);
        weatherService.sendNotificationToAll(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
    }

    //ten sam klient w dwóch różnych lokalizacjach otrzymuje jedno powiadomienie
    @Test
    public void shouldTheSameClientInDifferentLocationsReceivedOnlyOneNotification() {
        Location location2 = Mockito.mock(Location.class);
        weatherService.addSubscriber(client, location2);
        weatherService.sendNotificationToAll(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);

    }
    //wysłanie do lokalizacji istniejącej
    @Test
    public void shouldSendNotificationToLocalisationIfClientIsSubscribed(){
       weatherService.sendNotificationToLocation(location, notification);
       Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    //wysłanie do niezasubskrybowanej lokalizacji (innej)
    @Test
    public void shouldNotSendNotificationToLocationIfClientIsNotSubscribed(){
        Location location2 = Mockito.mock(Location.class);
        weatherService.sendNotificationToLocation(location2, notification);
        Mockito.verify(client, Mockito.times(0)).receive(notification);
    }


    //dodanie klienta do dwoch lokalizacji , usuniećie klienta, i sprawdzenie czy nie dostaje powiadomień
    @Test
    public void clientShouldBeAbleToCancelAllSubscriptions() {
        Location location2 = Mockito.mock(Location.class);
        Location location3 = Mockito.mock(Location.class);
        weatherService.addSubscriber(client, location2);
        weatherService.addSubscriber(client, location3);
        weatherService.removeAllSubscriptions(client);
        weatherService.sendNotificationToAll(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    //dodanie lokalizacji, usunięcie lokalizacji, wysłanie notyfikacji to tej lokalizacji
    @Test
    public void shouldRemoveLocation() {
        weatherService.addSubscriber(client, location);
        weatherService.removeLocation(location);
        weatherService.sendNotificationToLocation(location, notification);
        Mockito.verify(client, Mockito.times(0)).receive(notification);
    }
}