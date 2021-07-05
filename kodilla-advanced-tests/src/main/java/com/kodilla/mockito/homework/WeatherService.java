package com.kodilla.mockito.homework;
import javax.management.Notification;
import java.util.HashMap;
import java.util.Map;
import javax.xml.stream.Location;
import java.util.*;

public class WeatherService {
    private HashMap<Location, Set<Client>> users = new HashMap<>();



    public void addLocation(Location location) {
        System.out.println("Adding location " + location);
        users.put(location, new HashSet<Client>());

    }


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
        public void sendNotificationToLocation(Notification notification, Location location) {
        if(users.containsKey(location)) { //czy istnieje lokalizacja

            Set<Client> items = users.get(location);
            for(Client temp2: items) {
            temp2.receive(notification);
            }
        }


    }
    //2. Można wycofać subskrypcję z danej lokalizacji.
    public void removeSubscriptionFromLocation(Client client, Location location) { //od A.K.
        for (Map.Entry<Location, Set<Client>> entry : users.entrySet()) {
            if(entry.getKey().equals(location) && entry.getValue().contains(client)) {
                entry.getValue().remove(client);
                //entry.getKey().removeSubscriber(client);
            }
        }
    }
    //3. Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.
    public void removeAllSubscriptions(Client client) { //od A.K.
        for (Map.Entry<Location, Set<Client>> entry : users.entrySet()) {
            if(entry.getValue().contains(client)) {
                entry.getValue().remove(client);
                //entry.getKey().removeSubscriber(person);
            }
        }


    }
    //6. Możliwość skasowania danej lokalizacji.
    public void removeLocation(Location location) { //od A.K.
        for(Map.Entry<Location, Set<Client>> entry : users.entrySet()) {
            if (entry.getKey().equals(location)) {
                /*for(Client client : entry.getValue()) {
                entry.getKey().removeSubscriber(client);
                }

                 */
                users.remove(location);
            }
        }
        //users.remove(location);
    }

    public void removeSubscriber(Client client) {
        users.remove(client);
    }


}