package ies.puerto;

/**
 * Search a number in an array of integers
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio5 {

    /**
     * This function searches for a number in the given array and returns its position
     * @param array of integers
     * @param number to search
     * @return position
     */
    public int searchPosition(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
