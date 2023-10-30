package ies.puerto;

/**
 * Print even numbers in an array of integers
 * @author Jose Maximiliano Boada Martin
 */

public class Ejercicio4 {

    /**
     * Assigns even numbers in array to a string
     * @param array of integers
     * @return string of even numbers
     */
    public String evenNumbers(int[] array) {
        String result = "";
        for (int i : array) {
            if ((i % 2) == 0) {
                result += i + ", ";
            }
        }

        if (result.isEmpty()) {
            result = "There are no even numbers in this array";
        }

        return result.replaceAll(", $", "");
    }
}
