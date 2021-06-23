package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;


import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv", numLinesToSkip=0)
    public void numberOfWins(String numbers) throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        String temp[] = numbers.split(" ");
        Set<Integer> integerSet = new HashSet<>();
        for(String element:temp){
            integerSet.add(Integer.parseInt(element));

        }

        assertTrue(gamblingMachine.howManyWins(integerSet)>0);
        System.out.println(integerSet);
}
}