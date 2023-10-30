package ies.puerto;

/**
 * Find the maximum and minimum value in an array of integers
 * @author Jose Maximiliano Boada Martin
 */

public class Ejercicio3 {

    /**
     * Finds maximum number of an array
     * @param array of integers
     * @return max
     */
    public int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Finds minimum number of an array
     * @param array of integers
     * @return min
     */
    public int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
