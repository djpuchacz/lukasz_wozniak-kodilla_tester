package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideRightDataForTestingBMI")
    void shouldCalculateBMIWithProvidedDataExternalSource(Person person) {
        System.out.println(person.getBMI());
        Stream<String> expected = Stream.of("Underweight","Obese Class V (Super Obese)","Overweight","Normal (healthy weight)","Very severely underweight","Obese Class I (Moderately obese)");
        boolean match = expected.anyMatch( u-> u.equals(person.getBMI()));
        assertTrue(match);
    }

    /*@ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideWrongDataForTestingBMI")
    void shouldNotCalculateBMIWithZeroValues(Person person) {
        System.out.println(person.getBMI());
        Stream<String> expected = Stream.of("Overweight","Obese Class V (Super Obese)","Normal (healthy weight)","Normal (healthy weight)","Very severely underweight","Obese Class IV (Morbidly Obese)");
        boolean match = expected.noneMatch(un -> un.equals(person.getBMI()));
        assertFalse(match);

    }

     */


}