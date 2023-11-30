package ies.puerto;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws InvalidNameException {
        Scanner read = new Scanner(System.in);
        String name;
        System.out.println("Input name: ");
        name = read.next();

        if (name == null || name.isEmpty()) {
            throw new InvalidNameException("Name cannot be empty");
        }
    }
}
