package ies.puerto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio10Test {
    Ejercicio10 ejercicio10 = new Ejercicio10();

    public void checkDiagonalMatrixTrue(int[][] matrix) {
        Assertions.assertTrue(ejercicio10.isDiagonalMatrix(matrix), "Unexpected Result");
    }
    public void checkDiagonalMatrixFalse(int[][] matrix) {
        Assertions.assertFalse(ejercicio10.isDiagonalMatrix(matrix), "Unexpected Result");
    }

    @Test
    public void diagonalTrueTestOK() {
        int[][] matrix =
                {{1, 0, 0, 0, 0},
                {0, 2, 0, 0, 0},
                {0, 0, 3, 0, 0},
                {0, 0, 0, 4, 0},
                {0, 0, 0, 0, 5}};
        checkDiagonalMatrixTrue(matrix);
    }

    @Test
    public void diagonalFalseTestOK() {
        int[][] matrix =
                {{1, 0, 0, 0, 5},
                {0, 2, 0, 0, 0},
                {0, 0, 3, 0, 0},
                {0, 0, 0, 4, 0},
                {0, 0, 0, 0, 5}};
        checkDiagonalMatrixFalse(matrix);
    }

    @Test
    public void diagonalNonSquareTestOK() {
        int[][] matrix =
                {{1, 0, 0, 0},
                {0, 2, 0, 0},
                {0, 0, 3, 0},
                {0, 0, 0, 4},
                {0, 0, 0, 0}};
        checkDiagonalMatrixFalse(matrix);
    }
}
