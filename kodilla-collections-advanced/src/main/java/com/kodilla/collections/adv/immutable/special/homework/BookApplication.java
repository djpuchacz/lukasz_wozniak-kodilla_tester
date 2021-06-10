package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book created = bookManager.createBook("40 dni", "Jan Kowalski");
        //System.out.println("nr 1 to " + created);

        BookManager bookManager2 = new BookManager();
        bookManager.createBook("Noce i dnie", "Eliza Orzeszkowa");


        BookManager bookManager3 = new BookManager();
        bookManager.createBook("Lalka", "Bolesław Prus");


        Book bookOne = new Book("Pan Tadeusz", "Adam Mickiewicz");
        BookManager.library.add(bookOne);

        Book bookTwo = new Book("Ogniem i mieczem", "Henryk Sienkiewicz");
        BookManager.library.add(bookTwo);

        Book bookThree = new Book("Pan Tadeusz", "Adam Mickiewicz");
        BookManager.library.add(bookThree);

        System.out.println("All tokens: " + BookManager.library);
        System.out.println("Library size: " + BookManager.library.size());


        System.out.println("Do they have the same values?");
        System.out.println(bookOne.equals(bookThree));

        if(bookOne.equals(bookThree)) {
            System.out.println("Are they the same book? " + (bookOne==bookThree));

        }
    }

}
