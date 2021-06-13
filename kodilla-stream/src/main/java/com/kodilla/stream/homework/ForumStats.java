package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgOfPostAboveOr40 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >=40)
                .map(u ->u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("średnia liczba postów użytkowników w wieku 40+ to: "+avgOfPostAboveOr40);

    double avgOfPostBelow40 = UsersRepository.getUsersList()
            .stream()
            .filter(u -> u.getAge() <40)
            .map(u ->u.getNumberOfPost())
            .mapToInt(n -> n)
            .average()
            .getAsDouble();
        System.out.println("średnia liczba postów użytkowników w wieku poniżej 40 lat to: " +avgOfPostBelow40);
    }
}






/*
apisz Stream tak, aby obliczył średnią liczbę postów dla użytkowników, których wiek jest >= 40.

Napisz kolejny Stream, który obliczy średnią liczbę postów dla użytkowników, których wiek jest < 40.
 */