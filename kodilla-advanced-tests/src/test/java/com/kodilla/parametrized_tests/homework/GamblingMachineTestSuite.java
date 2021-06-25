package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv", numLinesToSkip = 0)
    public void testHowMayWins_WithCorrectNumbers(String entry) throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> numbers = convertToNumbers(entry);
        int finalResult = gamblingMachine.howManyWins(numbers);

     assertTrue(finalResult>=0&&finalResult<=6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/outOfRangeNumbers.csv", numLinesToSkip = 0)
    public void testHowMayWins_WithOutOfRangeNumbers(String entry) {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> numbers = convertToNumbers(entry);
        assertThrows(InvalidNumbersException.class, ()->gamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/lessnumbers.csv", numLinesToSkip = 0)
    public void testHowMayWins_WithLessNumbers(String entry) {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> numbers = convertToNumbers(entry);
        assertThrows(InvalidNumbersException.class, ()->gamblingMachine.howManyWins(numbers));
    }

    private Set<Integer> convertToNumbers(String word) { //zamiana stringów w plikach .csv na Set
    String[] strings = word.split(",");

    Set<Integer> results = new HashSet<>();
    for(String element :strings){
        Integer number = Integer.parseInt(element);
        results.add(number);
    }
    return results;
    }
}

