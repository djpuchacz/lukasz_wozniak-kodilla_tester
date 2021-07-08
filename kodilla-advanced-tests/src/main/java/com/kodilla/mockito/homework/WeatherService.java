package com.kodilla.mockito.homework;
import javax.management.Notification;
import java.util.HashMap;
import java.util.Map;
import javax.xml.stream.Location;
import java.util.*;

public class WeatherService {
    private HashMap<Location, Set<Client>> users = new HashMap<>();

    /*public void addLocation(Location location) {
        users.put(location, new HashSet<Client>());
    }

     */

    //1. Osoba zainteresowana może zostać zapisana do danej lokalizacji i zacznie otrzymywać powiadomienia.//OK
    public void addSubscriber(Client client, Location location) {
        //nie istnieje lokalizacja:
        if(users.containsKey(location)) {
            users.get(location).add(client);
        }
        //lokalizacja istnieje:
        else {
            Set<Client> clients = new HashSet<>();
            clients.add(client);
            users.put(location, clients);
        }
    }

    //5. Możliwość wysyłki powiadomienia do wszystkich.//OK
    public void sendNotificationToAll(Notification notification) {
        Collection<Set<Client>> values = users.values();
        Set<Client> temp = new HashSet<>();
        for(Set<Client> t : values){
            temp.addAll(t);
        }
        for (Client u : temp) {
            u.receive(notification);
        }
//a) dwóch klientów w dwóch różnych lokalizacjach otrzymują powiadomienia
        //b) ten sam klient w dwóch różnych lokalizacjach otrzymuj jedno powiadomienie
    }

    //4. Powiadomienie dla osób w danej lokalizacji powinno dotrzeć tylko do określonej grupy osób./OK
    public void sendNotificationToLocation(Location location, Notification notification) {
        if (users.containsKey(location))  //czy istnieje lokalizacja
            this.users.get(location).forEach(client -> client.receive(notification));

    }
    //1. wysłanie do lokalizacji istniejącej po po dodaniu klienta
    //2. wysłanie do lokalizacji nieistniejącej (innej)


    //2. Można wycofać subskrypcję z danej lokalizacji.//dodać wycofanie subskrypcji z niestniejącej lokalizacji
    public void removeSubscriptionFromLocation(Client client, Location location) {
       if(users.containsKey(location))
           this.users.get(location).remove(client);
    }

    //3. Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.
    public void removeAllSubscriptions(Client client) {
        for (Location location : users.keySet())
            users.get(location).remove(client);
    }
    //dodanie klienta do dwoch lokalizacji , usuniećie klienta, i sprawdzenie czy nie dostaje powiadomień

    //6. Możliwość skasowania danej lokalizacji.
    public void removeLocation(Location location) {
        users.remove(location);
    }
    //dodanie lokalizacji, usunięcie lokalizacji, wysłanie notyfikacji to tej lokalizacji


}