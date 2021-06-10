package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        LocalDate myDate = LocalDate.of(2019, 11, 20);
        LocalDate myDate2 = LocalDate.of(2019, 12, 20);
        LocalDate myDate3 = LocalDate.of(2019, 10, 20);
        LocalDate myDueDay = LocalDate.of(2020, 11, 20);
        LocalDate myDueDay2 = LocalDate.of(2021, 6, 20);
        LocalDate myDueDay3 = LocalDate.of(2022, 7, 20);
        tasks.add(new Task("Ben",myDate,myDueDay));
        tasks.add(new Task("Peter",myDate2,myDueDay2));
        tasks.add(new Task("John",myDate3,myDueDay3));
        return tasks;
    }
}

