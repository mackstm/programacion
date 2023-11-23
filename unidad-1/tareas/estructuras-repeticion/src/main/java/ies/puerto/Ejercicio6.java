package ies.puerto;

/**
 * Program that prints numbers between 1 and 20, but skips numbers divisible by 3
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
