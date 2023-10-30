package ies.puerto;

/**
 * This program calculates the average of a float array
 * @author Jose Maximiliano Boada Martin
 */

public class Ejercicio2 {

    /**
     * Calculates average of array elements
     * @param array of float
     * @return average of elements
     */
    public float averageOfArray(float[] array) {
        float sum = 0;
        for (float i : array) {
            sum += i;
        }
        return sum / array.length;
    }

}
