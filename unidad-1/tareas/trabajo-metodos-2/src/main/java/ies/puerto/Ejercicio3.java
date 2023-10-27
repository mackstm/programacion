package ies.puerto;

import java.util.Collections;
import java.util.List;

/**
 * Program containing the methods: write 5 numbers, write sum of numbers, write in descending
 * order and write in ascending order
 * @author Jose Maximiliano Boada Martin
 */

public class Ejercicio3 {

    /**
     * Function used to write numbers in a list
     * @param numbers list of numbers
     * @return printed list, trimmed for trailing spaces
     */
    public String writeNumbers(List<Integer> numbers) {
        StringBuilder result = new StringBuilder();

        for (Integer number : numbers) {
            result.append(number).append(" ");
        }

        return result.toString().trim();
    }

    /**
     * Function used to sum numbers in a list
     * @param numbers list of numbers
     * @return sum of numbers
     */
    public int sumOfNumbers(List<Integer> numbers) {
        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }

        return sum;
    }

    /**
     * Function that sorts numbers in a list in ascending order
     * @param numbers list of numbers
     * @return printed list in ascending order
     */
    public String orderNumbersAscending(List<Integer> numbers) {
        Collections.sort(numbers);
        return writeNumbers(numbers);
    }

    /**
     * Function that sorts numbers in a list in descending order
     * @param numbers list of numbers
     * @return printed list in descending order
     */
    public String orderNumbersDescending(List<Integer> numbers) {
        numbers.sort(Collections.reverseOrder());
        return writeNumbers(numbers);
    }
}