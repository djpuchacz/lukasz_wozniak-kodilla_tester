package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();
    Order order1 = new Order(100, LocalDate.of(2019,01,20),"Alicja B.C.");
    Order order2 = new Order(201, LocalDate.of(2017,02,11),"John Travolta");
    Order order3 = new Order(300, LocalDate.of(2018,01,03),"Al Pacino");
    Order order4 = new Order(199.99, LocalDate.of(2019,05,05),"Daniel Craig");
    Order order5 = new Order(39.99, LocalDate.of(2020,06,18),"Ariana Grande");
    Order order6 = new Order(112.50, LocalDate.of(2020,07,14),"Beyonce");
    Order order7 = new Order(100, LocalDate.of(2019,01,20),"Alicja B.C."); // duplikat

    @BeforeEach
    public void addSeveralOrdersToTheShop() throws IncorrectOrderException {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
        shop.addOrder(order7); // w secie nie może być duplikatów
    }

    //1. sprawdzić czy działa dodawanie nowych pozycji (Order) i czy rozmiar listy się zmienia.
    @Test
    public void shouldReturnCorrectNumberOfAddedOrders(){
        int expected = 6;
        assertEquals(expected, shop.getOrders().size());
    }

    //2. korzystając z własciwości SET  sprawdzic czy SET rzeczywiście nie przyjmuje duplikatu zamówienia
    @Test
    public void shouldNotAddDuplicatedOrder() throws IncorrectOrderException {
        int expectedOrderCount = shop.numberOfTotalOrders();
        shop.addOrder(new Order(100, LocalDate.of(2019,01,20),"Alicja B.C."));
        int actualOrderCount = shop.numberOfTotalOrders();
        assertEquals(expectedOrderCount, actualOrderCount);
    }

    //3. przetestować wyjątek w sytuacji kiedy w zamówieniu są nulle/zera, spacja, wartości ujemne
    @Test
    public void shouldThrowAnExceptionOnAttemptOfAddingOrderWithNegativeOrNullOrEmptyValues(){
        Order order = new Order(-15,null,"");
        Assertions.assertThrows(IncorrectOrderException.class, () -> {
            shop.addOrder(order);
        }
        );
    }

    //4. sprawdzić czy można dodać zamówienie z datą wsteczną
    @Test
    public void shouldThrowAnExceptionInCaseOfChoosePastDate() {
        Assertions.assertThrows(IncorrectOrderException.class, () -> {
            shop.addOrder(new Order(1900, LocalDate.of(2014,01,20), "adam123"));
        });

    }

    //5. sprawdzić czy klasa rzuca wyjątkiem kiedy w zawężonym okresie czasu nie znaleziono zamówień
    @Test
    public void shouldReturnZeroListSizeIfNoOrdersBetweenTwoDatesAreFound() throws IncorrectDateException {
        int emptyList = shop.orderListBasedOnRangeOfDates(LocalDate.of(2015,01,01), LocalDate.of(2016,01,01)).size();
        assertEquals(0, emptyList);
    }

    //6. sprawdzić czy zwracana jest właściwa ilość zamówień z zakresu dwóch dat,
    @Test
    public void shouldReturnCorrectListSizeIfOrdersBetweenTwoDatesAreFound() throws IncorrectDateException {
        int listSize = shop.orderListBasedOnRangeOfDates(LocalDate.of(2019,01,01), LocalDate.of(2020,07,18)).size();
        assertEquals(4, listSize);
    }

    // 7. sprawdzić czy suma wartości zamówień jest równa 0 jeśli nie było zamówień
    // 9. po uzyciu metody clear() sprawdzić czy liczba zamówień wynosi 0
    @Test
    public void shouldReturnZeroAsOrdersValueIfNoOrdersOnTheList(){
        shop.getOrders().clear();
        assertEquals(0, shop.sumOFOrdersValue());
    }

    // 8. sprawdzić czy zwracana jest poprawna suma wartości zamówień
    @Test
    public void shouldReturnCorrectOrdersValue(){
        assertEquals(953.48, shop.sumOFOrdersValue(), 0.1);
    }




}