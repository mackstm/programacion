package ies.puerto;

/**
 * Program used to check if a given number is positive or negative, and if it's even or odd
 * @author Jose Maximiliano Boada Martin
 */

public class Ejercicio2 {

    /**
     * Function used to check the number's sign and parity
     * @param number that will be checked
     * @return string that tells user the sign and parity
     */
    public String checkNumber(int number) {
        String result = "Number is negative";

        if (number >= 0) {
            result = "Number is positive";
        }

        if ((number % 2) == 0) {
            result += " and even";
        }
        else {
            result += " and odd";
        }
        return result;
    }
}
