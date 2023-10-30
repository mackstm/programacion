package ies.puerto;

/**
 * Transpose a matrix
 * @author Jose Maximiliano Boada Martin
 */

public class Ejercicio6 {

    /**
     * This function transposes a given matrix
     * @param matrix of integers
     * @return transposed matrix
     */
    public int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposedMatrix = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
}
