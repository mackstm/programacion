package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio5;
    @BeforeEach
    public void before() {
        ejercicio5 = new Ejercicio5();
    }

    public void checkPrimeNumber(int number, boolean resultOK) {
        boolean result = ejercicio5.isPrimeNumber(number);
        Assertions.assertEquals(resultOK, result, "Resultado no esperado");
    }

    @Test
    public void primeNumberTest() {
        checkPrimeNumber(2, true);
        checkPrimeNumber(97, true);
        checkPrimeNumber(93, false);
        checkPrimeNumber(1, false);
        checkPrimeNumber(-5, false);
    }
}