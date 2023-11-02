package ies.puerto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio07Test {
    Ejercicio07 ejercicio07 = new Ejercicio07();

    public void checkSort(int[] array, int[] resultOK) {
        int[] result = ejercicio07.sortArray(array);
        Assertions.assertArrayEquals(resultOK, result, "Unexpected result");
    }

    @Test
    public void sortTestOK() {
        int[] array = {8, 6, 4, 3, 4};
        int[] resultOK = {3, 4, 4, 6, 8};
        checkSort(array, resultOK);
    }

    @Test
    public void sortNegativeTestOK() {
        int[] array = {0, 7, -7, 5, 2};
        int[] resultOK = {-7, 0, 2, 5, 7};
        checkSort(array, resultOK);
    }
}
