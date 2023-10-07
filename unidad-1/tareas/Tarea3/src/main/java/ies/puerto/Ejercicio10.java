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
        int limite;

        System.out.println("Introduzca el límite: ");
        limite = read.nextInt();

        // Bucle do while que imprime todos los números pares entre 1 y el límite. Como 1 no es par, empezamos por el 2
        // para ahorrar una iteración
        int i = 2;
        do {

            if (i % 2 == 0) {
                System.out.println(i);
            }

            i++;
        } while (i <= limite);

    }
}
