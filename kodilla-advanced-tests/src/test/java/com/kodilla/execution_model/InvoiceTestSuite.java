package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InvoiceTestSuite {
        Invoice invoice = new Invoice();
        Item tv = new Item("LG", 4000.0);
        Item soundbar = new Item("Sony", 500.0);
        Item dishwasher = new Item("Bosch", 1500.0);

    @Test
    public void shouldAddItemsToInvoice() {
       //When
        int numberOfItems = invoice.getSize();
        //Then
        assertEquals(3, numberOfItems);
    }
    //Dodanie kilku pozycji, pobranie jednej z nich, sprawdzenie, czy wartości nazwy i ceny są zgodne z wartościami oczekiwanymi.

    @Test
    public void shouldGetExistingItem() {
        //When
        Item result = invoice.getItem(0);
        //Then
        assertEquals("LG",result.getName());
        assertEquals(4000.0,result.getPrice(),0.01);


    }

    //Pobranie elementu o ujemnym indeksie – oczekiwany wynik to null.
    @Test
    public void shouldReturnTrueWhenPassingNegativeIndex() {
        //When
        Item result = invoice.getItem(-2);
        //Then
        assertNull(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingOutOfIndex() {
       //When
        Item result = invoice.getItem(3);
        //Then
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {
        //When
        invoice.clear();
        //Then
        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(tv);
        invoice.addItem(soundbar);
        invoice.addItem(dishwasher);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}