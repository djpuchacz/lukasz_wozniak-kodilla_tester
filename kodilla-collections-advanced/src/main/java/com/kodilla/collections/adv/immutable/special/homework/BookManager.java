package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    public static List<Book> library = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book newBook = new Book(title, author); //sprawdzić jak to się nazywa ; konstruktor otwarty ?

        for (Book book : library) {
            System.out.println("Is in library? : " + book.equals(newBook));
            if (book.equals(newBook)) {
                return book;
            }
        }
        library.add(newBook);
        return newBook;
    }

}
