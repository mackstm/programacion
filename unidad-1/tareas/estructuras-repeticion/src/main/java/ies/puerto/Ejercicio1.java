package ies.puerto;

/**
 * Program to find first number divisible by 5 and 7 between 1 and 100 (including 100), using break
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(i + " is divisible by 5 and 7");
                break;
            }
        }
    }
}