package ies.puerto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio8Test {
    Ejercicio8 ejercicio8 = new Ejercicio8();

    public void checkDuplicateDeletion(int[] array, int[] resultOK) {
        int[] result = ejercicio8.deleteDuplicates(array);
        Assertions.assertArrayEquals(resultOK, result, "Unexpected result");
    }

    @Test
    public void dupeTestOK() {
        int[] array = {2, 3, 7, 3, 8};
        int[] resultOK = {2, 3, 7, 8};

        checkDuplicateDeletion(array, resultOK);
    }
}
