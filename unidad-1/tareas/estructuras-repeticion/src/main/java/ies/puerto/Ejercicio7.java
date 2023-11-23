package ies.puerto;

/**
 * Program to print numbers between 1 and 20, using continue to skip even numbers
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
