package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.76, 50.9)),
                Arguments.of(new Person(1.55, 65.8)),
                Arguments.of(new Person(1.90, 105.1)),
                Arguments.of(new Person(1.62, 49.5)),
                Arguments.of(new Person(1.93, 48.0)),
                Arguments.of(new Person(2.10, 150.2))
        );
    }


}

