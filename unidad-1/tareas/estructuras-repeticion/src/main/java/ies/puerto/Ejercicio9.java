package ies.puerto;

/**
 * Program to find and count numbers over 50 in an array, using continue to skip numbers lesser than or equal to 50
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int[] numbers = {40, 60, 30, 80, 50, 45, 70};

        for (int number : numbers) {
            if (number <= 50) {
                continue;
            }
            System.out.println(number);
        }
    }
}
