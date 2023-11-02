package ies.puerto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio08Test {
    Ejercicio08 ejercicio08 = new Ejercicio08();

    public void checkDuplicateDeletion(int[] array, int[] resultOK) {
        int[] result = ejercicio08.deleteDuplicates(array);
        Assertions.assertArrayEquals(resultOK, result, "Unexpected result");
    }

    @Test
    public void dupeTestOK() {
        int[] array = {2, 3, 7, 3, 8};
        int[] resultOK = {2, 3, 7, 8};
        checkDuplicateDeletion(array, resultOK);
    }

    @Test
    public void dupe0ElementTestOK() {
        int[] array = new int[0];
        checkDuplicateDeletion(array, array);
    }

    @Test
    public void dupe1ElementTestOK() {
        int[] array = {100};
        checkDuplicateDeletion(array, array);
    }
}
