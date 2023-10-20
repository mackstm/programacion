package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4;
    @BeforeEach
    public void before() {
        ejercicio4 = new Ejercicio4();
    }

    public void greaterOfTwo (int numberA, int numberB, int resultOK) {
        int result = ejercicio4.greaterNumber(numberA, numberB);
        Assertions.assertEquals(resultOK, result, "No se ha obtenido el resultado esperado");
    }

    public void greaterOfThree (int numberA, int numberB, int numberC, int resultOK) {
        int result = ejercicio4.greaterNumber(numberA, numberB, numberC);
        Assertions.assertEquals(resultOK, result, "No se ha obtenido el resultado esperado");
    }

    @Test
    public void greaterNumberTestOK() {
        greaterOfTwo(5, 4, 5);
        greaterOfTwo(4, 5, 5);
        greaterOfTwo(-4, 3, 3);
        greaterOfTwo(5, 5, 5);
        greaterOfThree(7, 4, 3, 7);
        greaterOfThree(4, 7, 3, 7);
        greaterOfThree(-4, -7, 1, 1);
    }
}