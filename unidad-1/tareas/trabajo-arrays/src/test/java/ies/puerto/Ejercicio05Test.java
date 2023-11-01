package ies.puerto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio05Test {
    Ejercicio05 ejercicio05 = new Ejercicio05();

    public void checkArraySearch(int[] array, int number, int resultOK) {
        int result = ejercicio05.searchPosition(array, number);
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }

    @Test
    public void searchFor5TestOK() {
        int[] array = {1, 2, 3, 5, 4};
        checkArraySearch(array, 5, 3);
    }

    @Test
    public void failSearchTestOK() {
        int[] array = {1, 2, 3, 5, 4};
        checkArraySearch(array, 6, -1);
    }
}
