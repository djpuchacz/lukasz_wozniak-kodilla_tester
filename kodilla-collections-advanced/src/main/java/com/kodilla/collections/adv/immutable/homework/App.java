package com.kodilla.collections.adv.immutable.homework;

public class App {
    public static void main(String[] args) {
        Task task = new TaskHacked("Odkurzanie", 10);
        TaskHacked taskHacked = (TaskHacked) task;
        taskHacked.modifyTitle("New title");
        System.out.println(task.getTitle());
    }
}
