package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> provideDataForBmiCalculate() {
        return Stream.of(
                Arguments.of(1.76, 50.9),
                Arguments.of(1.55, 65.8),
                Arguments.of(1.90, 105.1),
                Arguments.of(1.65, 49.5),
                Arguments.of(1.74, 99.3)
        );
    }
}
