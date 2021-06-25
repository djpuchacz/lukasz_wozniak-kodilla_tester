package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideDataForTestingBMI")
    void shouldCalculateBMIWithProvidedDataExternalClass(Person person) {
        System.out.println(person.getBMI());
        Stream<String> expected = Stream.of("Underweight","Obese Class V (Super Obese)","Overweight","Normal (healthy weight)","Very severely underweight","Obese Class I (Moderately obese)");
        boolean check = expected.anyMatch( u-> u.equals(person.getBMI()));
        assertTrue(check);
    }


}