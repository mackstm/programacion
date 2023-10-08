package ies.puerto;

import java.util.Scanner;

/**
 * @author José Maximiliano Boada Martín
 *
 * Calcular la suma de todos los números pares entre 1 y un número ingresado por el usuario utilizando un bucle do-while.
 */

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int limit;

        System.out.println("Introduzca el límite: ");
        limit = read.nextInt();

        // Bucle do while que imprime todos los números pares entre 1 y el límite.
        int i = 2;
        do {
                System.out.println(i);

            i += 2;
        } while (i <= limit);

    }
}
