package ies.puerto;

import java.util.Arrays;

/**
 * Delete duplicate elements in an array
 * @author Jose Maximiliano Boada Martin
 */

public class Ejercicio8 {
    
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
        int newLength = array.length;

        for (int i = 0; i < newLength; i++) {
            for (int j = i + 1; j < newLength; j++) {
                if (array[i] == array[j + 1]);
                array[j] = array[newLength - 1];
                newLength--;
                j++;
            }
        }

        int[] uniqueArray = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            uniqueArray[i] = array[i];
        }

        return uniqueArray;
    }
}
