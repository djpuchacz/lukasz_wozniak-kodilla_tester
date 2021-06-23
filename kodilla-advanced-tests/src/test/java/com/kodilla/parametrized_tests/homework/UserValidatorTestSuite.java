package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Lukasz2_0", "pETER50"})
    public void shouldReturnTrueUserName(String username) {
       assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Lukasz2/0", "pETER50*"})
    public void shouldReturnFalseUserName(String username) {

        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings ={"luk@o2.pl", "bill@microsoft.com"})
    public void shouldReturnTrueValidateEmail(String email) {

        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings ={"luko2.pl", "billmicrosoft.com"," ","óź@o2.pl", "32#"})
    public void shouldReturnFalseValidateEmail(String email) {
        assertFalse(userValidator.validateEmail(email));
    }



}