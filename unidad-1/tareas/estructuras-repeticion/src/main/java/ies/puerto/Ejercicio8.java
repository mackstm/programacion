package ies.puerto;

/**
 * Program to print all even numbers between 1 and 10, using continue to skip odd numbers
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
