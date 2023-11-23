package ies.puerto;

/**
 * Program to find first prime number over 100 using break
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println("First prime number after 100 is: " + i);
                break;
            }
        }
    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
