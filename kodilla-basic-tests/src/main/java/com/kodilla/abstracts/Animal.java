package com.kodilla.abstracts;

public abstract class Animal {
    private int numberOfLegs;

    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public abstract void giveVoice();//Zwróć uwagę na słówko abstract przy
    // deklarowaniu metody oraz na fakt, że metoda nie ma ciała – to znaczy
    // nie ma pary klamrowych nawiasów zawierających
    // kod, który powinien być wykonany. Oznaczając metodę jako abstrakcyjną,
    // stawiamy średnik bezpośrednio po nawiasach.
}
