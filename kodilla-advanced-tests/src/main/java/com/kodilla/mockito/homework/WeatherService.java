package com.kodilla.mockito.homework;
import javax.management.Notification;
import java.util.HashMap;
import java.util.Map;
import javax.xml.stream.Location;
import java.util.*;

public class WeatherService {
    private HashMap<Location, Set<Client>> users = new HashMap<>();

    //1. Osoba zainteresowana może zostać zapisana do danej lokalizacji i zacznie otrzymywać powiadomienia.
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

    //5. Możliwość wysyłki powiadomienia do wszystkich.
    public void sendNotificationToAll(Notification notification) {
        Collection<Set<Client>> values = users.values();
        Set<Client> temp = new HashSet<>();
        for(Set<Client> t : values){
            temp.addAll(t);
        }
        for (Client u : temp) {
            u.receive(notification);
        }

    }

    //4. Powiadomienie dla osób w danej lokalizacji powinno dotrzeć tylko do określonej grupy osób.
    public void sendNotificationToLocation(Location location, Notification notification) {
        if (users.containsKey(location))  //czy istnieje lokalizacja
            this.users.get(location).forEach(client -> client.receive(notification));

    }

    //2. Można wycofać subskrypcję z danej lokalizacji.
    public void removeSubscriptionFromLocation(Client client, Location location) {
       if(users.containsKey(location))
           this.users.get(location).remove(client);
    }

    //3. Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.
    public void removeAllSubscriptions(Client client) {
        for (Location location : users.keySet())
            users.get(location).remove(client);
    }

    //6. Możliwość skasowania danej lokalizacji.
    public void removeLocation(Location location) {
        users.remove(location);
    }

}