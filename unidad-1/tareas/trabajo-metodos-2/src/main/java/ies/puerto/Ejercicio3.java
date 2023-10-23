package ies.puerto;

import java.util.Collections;
import java.util.List;

/**
 * Program containing the methods: write 5 numbers, write sum of numbers, write in descending
 * order and write in ascending order
 * @author Jose Maximiliano Boada Martin
 */

public class Ejercicio3 {

    public String writeNumbers(List<Integer> numbers) {
        StringBuilder result = new StringBuilder();

        for (Integer number : numbers) {
            result.append(number).append(" ");
        }

        return result.toString().trim();
    }

    public int sumOfNumbers(List<Integer> numbers) {
        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }

        return sum;
    }

    public String orderNumbersAscending(List<Integer> numbers) {
        Collections.sort(numbers);
        return writeNumbers(numbers);
    }

    public String orderNumbersDescending(List<Integer> numbers) {
        numbers.sort(Collections.reverseOrder());
        return writeNumbers(numbers);
    }
}
