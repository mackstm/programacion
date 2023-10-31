package ies.puerto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio7Test {
    Ejercicio7 ejercicio7 = new Ejercicio7();

    public void checkSort(int[] array, int[] resultOK) {
        int[] result = ejercicio7.sortArray(array);
        Assertions.assertArrayEquals(resultOK, result, "Unexpected result");
    }

    @Test
    public void sortTestOK() {
        int[] array = {8, 6, 4, 3, 4};
        int[] resultOK = {3, 4, 4, 6, 8};
        checkSort(array, resultOK);
    }

    @Test
    public void sortTestNegativeOK() {
        int[] array = {0, 7, -7, 5, 2};
        int[] resultOK = {-7, 0, 2, 5, 7};
        checkSort(array, resultOK);
    }
}
