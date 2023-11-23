package ies.puerto;

/**
 * Program to find first number divisible by 5 over 30, using break
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        for (int i = 31; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println("First number divisible by 5 over 30: " + i);
                break;
            }
        }
    }
}
