package ies.puerto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4 = new Ejercicio4();

    public void checkArrayEven(int[] array, String resultOK) {
        String result = ejercicio4.evenNumbers(array);
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
