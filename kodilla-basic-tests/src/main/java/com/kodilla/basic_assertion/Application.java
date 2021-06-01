package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult, 0);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        double subtractResult = calculator.subtract(a, b);
        boolean correct2 = ResultChecker.assertEquals(-3, subtractResult,0);
        if (correct2) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double expResult = calculator.exp(a);
        boolean correct3 = ResultChecker.assertEquals(25, expResult,0);// 24 dla sprawdzenia
        if (correct3) {
            System.out.println("Metoda exp działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda exp nie działa poprawnie dla liczby " + a);
        }
    }
}
