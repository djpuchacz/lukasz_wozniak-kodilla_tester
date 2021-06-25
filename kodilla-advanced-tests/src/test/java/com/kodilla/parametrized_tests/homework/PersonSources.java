package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> provideRightDataForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.76, 50.9)),
                Arguments.of(new Person(1.55, 65.8)),
                Arguments.of(new Person(1.90, 105.1)),
                Arguments.of(new Person(1.62, 49.5)),
                Arguments.of(new Person(1.93, 48.0)),
                Arguments.of(new Person(2.10, 150.2))
        );
    }

    /*static Stream<Arguments> provideWrongDataForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(0, 0)),
                Arguments.of(new Person(1.50, 0)),
                Arguments.of(new Person(0, 50))

        );

    }

     */
}

