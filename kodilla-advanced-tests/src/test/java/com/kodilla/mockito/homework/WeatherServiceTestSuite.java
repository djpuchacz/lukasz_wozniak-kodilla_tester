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
        //weatherService.addLocation(location);
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
        //weatherService.addLocation(location2);
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
    public void subscriberShouldBeAbleToCancelSubscriptionFromLocation() {
        weatherService.removeSubscriptionFromLocation(client, location);
        weatherService.sendNotificationToLocation(location, notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void subscriberShouldBeAbleToCancelSubscriptionFromAllLocations() {
        Location location2 = Mockito.mock(Location.class);
        //weatherService.addLocation(location2);
        Location location3 = Mockito.mock(Location.class);
        //weatherService.addLocation(location3);
        weatherService.addSubscriber(client, location2);
        weatherService.addSubscriber(client, location3);
        weatherService.removeAllSubscriptions(client);
        weatherService.sendNotificationToLocation(location, notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
    //usuwanie lokalizacji removelocation
    @Test
    public void locationShouldBeRemoved() {
        weatherService.removeLocation(location);
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

    //ten sam klient w dwóch różnych lokalizacjach otrzymuj jedno powiadomienie
    @Test
    public void shouldTheSameClientInDifferentLocalisationsReceivedOnlyOneNotification() {
        Location location2 = Mockito.mock(Location.class);
        weatherService.addSubscriber(client, location2);
        weatherService.sendNotificationToAll(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);

    }
    ///1. wysłanie do lokalizacji istniejącej po po dodaniu klienta
    @Test
    public void shouldSendNotificationToLocalisationIfClientSubscribed(){
       weatherService.addSubscriber(client, location);
       weatherService.sendNotificationToLocation(location, notification);
       Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    //2. wysłanie do lokalizacji nieistniejącej (innej)
    @Test
    public void shouldSendNotificationToLocalisationIfClientNotSubscribed(){
        weatherService.addSubscriber(client, location);
        Location location2 = Mockito.mock(Location.class);
        weatherService.sendNotificationToLocation(location2, notification);
        Mockito.verify(client, Mockito.times(0)).receive(notification);
    }

}