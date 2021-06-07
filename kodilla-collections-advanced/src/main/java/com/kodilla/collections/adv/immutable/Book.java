package com.kodilla.collections.adv.immutable;

public final class Book {
    protected final String author; //protected. Oznacza to, że są one traktowane jak pola prywatne z tym jednak zastrzeżeniem, że dostęp do nich mogą mieć również klasy dziedziczące z klasy Book oraz inne klasy w obrębie tego samego pakietu.
    protected final String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public final String getAuthor() {
        return author;
    }

    public final String getTitle() {
        return title;
    }

}
