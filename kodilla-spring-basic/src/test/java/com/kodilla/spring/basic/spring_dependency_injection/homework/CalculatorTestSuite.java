package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void shouldReturnAdditionResult(){
        double result = bean.add(2,4.5);
        Assertions.assertEquals(6.5, result);
    }
    @Test
    public void shouldReturnSubtractionResult(){
        double result = bean.subtract(2.0,4.5);
        Assertions.assertEquals(-2.5, result);
    }
    @Test
    public void shouldReturnMultiplicationResult(){
        double result = bean.multiply(3.14, 3.14);
        Assertions.assertEquals(9.8596,result);
    }
    @Test
    public void shouldReturnDivideResultIfCorrectDataProvided() throws ZeroUsageException {
        double result = bean.divide(5.5, 1.1);
        Assertions.assertEquals(5.0, result);
    }
    @Test
    public void shouldReturnDivideResultInCaseDivideByZero(){
        Assertions.assertThrows(ZeroUsageException.class, ()->{
            double result = bean.divide(5.5, 0);
        });
    }
}
