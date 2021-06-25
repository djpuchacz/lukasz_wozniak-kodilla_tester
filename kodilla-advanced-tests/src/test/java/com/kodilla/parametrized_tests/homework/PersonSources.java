package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(1.76, 50.9, "Underweight"),
                Arguments.of(1.55, 65.8, "Overweight"),
                Arguments.of(1.90, 105.1, "Overweight"),
                Arguments.of(1.62, 49.5, "Normal (healthy weight)"),
                Arguments.of(1.93, 48.0, "Very severely underweight"),
                Arguments.of(2.10, 150.2, "Obese Class I (Moderately obese)")
        );
    }


}

