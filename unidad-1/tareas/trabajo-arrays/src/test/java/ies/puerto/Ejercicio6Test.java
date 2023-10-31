package ies.puerto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio6Test {
    Ejercicio6 ejercicio6 = new Ejercicio6();

    public void checkTransposition(int[][] matrix, int[][] resultOK) {
        int[][] result = ejercicio6.transposeMatrix(matrix);
        Assertions.assertArrayEquals(resultOK, result, "Unexpected result");
    }

    @Test
    public void transposeTestOK() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] resultOK = {{1, 5, 9}, {2, 6, 10}, {3, 7, 11}, {4, 8, 12}};
        checkTransposition(matrix, resultOK);
    }
    @Test
    public void transposeSingleRowTest() {
        int[][] matrix = {{1, 1}};
        int[][] resultOK = {{1}, {1}};
        checkTransposition(matrix, resultOK);
    }
}
