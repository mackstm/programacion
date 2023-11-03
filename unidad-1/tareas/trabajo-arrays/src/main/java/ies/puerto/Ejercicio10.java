package ies.puerto;

/**
 * Check if a matrix is diagonal
 * @author Jose Maximiliano Boada Martin
 */

public class Ejercicio10 {

    /**
     * Checks if matrix is diagonal
     * @param matrix has to be a square matrix
     * @return true or false
     */
    public boolean isDiagonalMatrix(int[][] matrix) {
        if (matrix.length != matrix[0].length){
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}