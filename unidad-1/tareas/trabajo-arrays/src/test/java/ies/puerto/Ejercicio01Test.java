package ies.puerto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio01Test {
    Ejercicio01 ejercicio01 = new Ejercicio01();

    public void checkArraySum(int[] array, int resultOK) {
        int result = ejercicio01.arraySum(array);
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }

    @Test
    public void sumTestOK() {
        int[] array = {1, 2, 3};
        checkArraySum(array, 6);
    }
    @Test
    public void sumWithNegativeTestOK() {
        int[] array = {1, -2, 3, -8};
        checkArraySum(array, -6);
    }
}
