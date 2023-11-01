package ies.puerto;

import java.util.Arrays;

/**
 * Delete duplicate elements in an array
 * @author Jose Maximiliano Boada Martin
 */

public class Ejercicio08 {
    
    /**
     * Deletes duplicates in array
     * @param array of integers
     * @return new array with no duplicates
     */
    public int[] deleteDuplicates(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return array;
        }
        Arrays.sort(array);

        int[] intermediate = new int[array.length];

        int newLength = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                intermediate[newLength++] = array[i];
            }
        }

        intermediate[newLength++] = array[array.length - 1];

        int[] uniqueArray = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            uniqueArray[i] = intermediate[i];
        }

        return uniqueArray;
    }
}
