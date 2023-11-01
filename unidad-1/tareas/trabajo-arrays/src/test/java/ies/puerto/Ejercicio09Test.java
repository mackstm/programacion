package ies.puerto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio09Test {
    Ejercicio09 ejercicio09 = new Ejercicio09();

    public void checkCombineArray(int[] array1, int[] array2, int[] resultOK) {
        int[] result = ejercicio09.combineArrays(array1, array2);
        Assertions.assertArrayEquals(resultOK, result, "Unexpected result");
    }

    @Test
    public void combineTestOK() {
        int[] array1 = {1, 5};
        int[] array2 = {5, 9, 3};
        int[] resultOK = {1, 5, 5, 9, 3};
        checkCombineArray(array1, array2, resultOK);
    }

    @Test
    public void combine0Element1TestOK() {
        int[] array1 = new int[0];
        int[] array2 = {100, 2, 776};
        checkCombineArray(array1, array2, array2);
    }

    @Test
    public void combine0Element2TestOK() {
        int[] array1 = {3, 4, 1024};
        int[] array2 = new int[0];
        checkCombineArray(array1, array2, array1);
    }

    @Test
    public void combine0ElementBothTestOK() {
        int[] array = new int[0];
        checkCombineArray(array, array, array);
    }
}
