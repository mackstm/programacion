package ies.puerto;

import java.util.Scanner;

/**
 * Division by 0 exception
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Input first number: ");
        float valueA = read.nextFloat();

        System.out.println("Input second number: ");
        float valueB = read.nextFloat();

        if (valueB == 0) {
            throw new ArithmeticException("Can't divide by zero");
        }

        System.out.println("The result is: " + (valueA / valueB));
    }
}