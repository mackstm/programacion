package ies.puerto;

/**
 * Combine two arrays keeping the same order
 * @author Jose Maximiliano Boada Martin
 */

public class Ejercicio09 {

    /**
     * Function that combines two arrays into a single array
     * @param array1 of integers
     * @param array2 of integers
     * @return combined array
     */
    public int[] combineArrays(int[] array1, int[] array2) {
        if(array1.length == 0) {
            return array2;
        }

        if (array2.length == 0) {
            return array1;
        }

        int[] result = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
            result[array1.length + i] = array2[i];
        }

        for (int i = 0; i < array2.length; i++) {
            result[array1.length + i] = array2[i];
        }

        return result;
    }
}
