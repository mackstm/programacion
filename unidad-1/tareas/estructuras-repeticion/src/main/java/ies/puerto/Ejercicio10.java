package ies.puerto;

/**
 * Program to print all positive numbers in an array, using continue to skip negative numbers
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int[] numbers = {-2, 5, -8, 10, 15, -3, 7};

        for (int number : numbers) {
            if (number < 0) {
                continue;
            }
            System.out.println(number);
        }
    }
}
