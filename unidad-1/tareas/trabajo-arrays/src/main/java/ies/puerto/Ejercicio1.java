package ies.puerto;

/**
 * Program used to calculate sum of all elements in an array of integers
 * @author Jose Maximiliano Boada Martin
 */

public class Ejercicio1 {

    /**
     * Function that calculates the sum of elements in an array
     * @param array of integers
     * @return sum of array elements
     */
    public int arraySum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
