package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> lists = new ArrayList<>();
    public School(int... lists) {
        for (int list : lists)
            this.lists.add(list);
    }

    public int getQuantity() {
        int sum = 0;
        for (int list : lists)
            sum += list;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "lists=" + lists +
                '}';
    }
}
