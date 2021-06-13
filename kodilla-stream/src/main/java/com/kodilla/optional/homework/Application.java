package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Al", new Teacher("Jo")));
        students.add(new Student("Ben", new Teacher("Rob")));
        students.add(new Student("Cecil", null));
        students.add(new Student("Darius", null));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();

            System.out.println("Student: " + student.getName() + " Teacher: " + teacherName);
        }
    }
}

