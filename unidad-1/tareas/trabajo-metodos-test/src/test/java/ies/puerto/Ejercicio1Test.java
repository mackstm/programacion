package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

        Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void calcFactorial5TestOK() {
        int result = 0;
        int resultCorrect = 120;
        result = ejercicio1.calcFactorial(5);
        Assertions.assertEquals(resultCorrect, result, "No es el resultado esperado");
    }
}
