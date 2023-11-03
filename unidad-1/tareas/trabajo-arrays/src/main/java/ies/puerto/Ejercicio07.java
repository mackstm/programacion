package ies.puerto;

/**
 * Sort array elements in ascending order
 * @author Jose Maximiliano Boada Martin
 */

public class Ejercicio07 {
    
    /**
     * Sort array using bubble sort
     * @param array of integers
     * @return sorted array
     */
    public int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}