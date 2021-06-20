package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WarehouseTestSuite {
    Warehouse warehouse = new Warehouse();
    Order item5 = new Order("item5");

    @Test
    public void testDoesOrderExist() throws OrderDoesntExistException {
        //given
        warehouse.addOrder(item5);
        //when
        Order test = warehouse.getOrder("item5");
        //then
        assertEquals(item5, test);
    }

    @Test
    public  void testDoesOrderExist_withException() throws OrderDoesntExistException {
        //given
        warehouse.addOrder(item5);
        //when

        //then
        assertThrows(OrderDoesntExistException.class, ()-> warehouse.getOrder("item6"));

    }

}