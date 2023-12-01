package ies.puerto;

import java.util.Scanner;

/**
 * Verify whether a string begins or ends with a specific substring
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        String str = "Soy un superviviente";

        Scanner read = new Scanner(System.in);

        System.out.println("Input substring: ");
        String substr = read.next();

        System.out.println(str.startsWith(substr));
        System.out.println(str.endsWith(substr));
    }

    public static boolean checkSubstring(String str, String substr) {
        return false;
    }
}
