package ies.puerto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    public void checkArraySum(int[] array, int resultOK) {
        int result = ejercicio1.arraySum(array);
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }

    @Test
    public void sumTestOK() {
        int[] array = {1, 2, 3};
        checkArraySum(array, 6);
    }
    @Test
    public void sumWithNegativeTest() {
        int[] array = {1, -2, 3, -8};
        checkArraySum(array, -6);
    }
}
