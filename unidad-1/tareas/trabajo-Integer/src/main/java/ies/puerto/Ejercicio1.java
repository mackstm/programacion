package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Input an integer and verify if it's even or odd
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try {
            System.out.println("Input a number: ");
            int value = read.nextInt();
            Integer mod = value % 2;

            System.out.println(mod.equals(0) ? "The number is even" : "The number is odd");

        } catch (InputMismatchException e) {
            System.out.println("Must be an integer number");
        }

    }
}