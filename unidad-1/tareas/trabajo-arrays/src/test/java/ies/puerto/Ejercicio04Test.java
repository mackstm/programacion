package ies.puerto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio04Test {
    Ejercicio04 ejercicio04 = new Ejercicio04();

    public void checkArrayEven(int[] array, String resultOK) {
        String result = ejercicio04.evenNumbers(array);
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }

    @Test
    public void evenTestOK() {
        int[] array = {1, 5, 3, 0};
        checkArrayEven(array, "0");
    }

    @Test
    public void noEvenTestOK() {
        int[] array = {1, 5, 3, 5, 7, 9};
        checkArrayEven(array, "There are no even numbers in this array");
    }

    @Test
    public void even5TestOK() {
        int[] array = {1, 5, 2, 3, 0, 4, 9, 6, 100};
        checkArrayEven(array, "2, 0, 4, 6, 100");
    }
}
