package ies.puerto;

import java.util.Scanner;

/**
 * Replace all occurrences of a character for a string
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner readChar = new Scanner(System.in);
        Scanner readReplacement = new Scanner(System.in);

        String avocado = "avocado with lemon";
        String replaceMe;
        String replacement;

        System.out.println("Input character you wish to replace: ");
        replaceMe = readChar.next();

        System.out.println("Input replacement string: ");
        replacement = readReplacement.next();

        avocado = avocado.replace(replaceMe, replacement);

        System.out.println(avocado);
    }
}
