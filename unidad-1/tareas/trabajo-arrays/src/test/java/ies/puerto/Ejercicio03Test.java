package ies.puerto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio03Test {
    Ejercicio03 ejercicio03 = new Ejercicio03();

    public void checkArrayMax(int[] array, int resultOK) {
        int result = ejercicio03.findMax(array);
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }
    public void checkArrayMin(int[] array, int resultOK) {
        int result = ejercicio03.findMin(array);
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }

    @Test
    public void maxTestOK() {
        int[] array = {1, 5, 3, 0};
        checkArrayMax(array, 5);
    }

    @Test
    public void maxNegativeTestOK() {
        int[] array = {-99, -45, -2, -252, 0};
        checkArrayMax(array, 0);
    }

    @Test
    public void minTestOK() {
        int[] array = {1, 5, 3, 0};
        checkArrayMin(array, 0);
     }

    @Test
    public void minNegativeTestOK() {
        int[] array = {-99, -45, -2, -252, 0};
        checkArrayMin(array, -252);
    }
}
