package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();

    public void checkNumberForTest(int number, String resultOK) {
        String result = ejercicio2.checkNumber(number);
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }

    @Test
    public void check5TestOK() {
        checkNumberForTest(5, "Number is positive and odd");
    }

    @Test
    public void calc96TestOK() {
        checkNumberForTest(96, "Number is positive and even");
    }

    @Test
    public void calcNeg99TestOK() {
        checkNumberForTest(-99, "Number is negative and odd");
    }

    @Test
    public void calcNeg8TestOK() {
        checkNumberForTest(-8, "Number is negative and even");
    }
}