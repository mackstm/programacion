package ies.puerto;

import java.util.Scanner;

/**
 * @author José Maximiliano Boada Martín
 *
 * Escribe un programa en Java que encuentre el máximo común divisor (MCD) de dos números. Se debe solicitar los números por teclado.
 */
public class Ejercicio02 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int valorA, valorB;

        System.out.println("Introduzca el valor de A: ");
        valorA = read.nextInt();

        System.out.println("Introduzca el valor de B: ");
        valorB = read.nextInt();

        // Inicializamos MCD a 1, puesto que siempre será como mínimo 1
        int mcd = 1;
        int i = 1;
        while (i <= valorA && i <= valorB) {

            // Usamos la iteración como divisor para ver si es divisible por ambos números. Si lo es, actualizamos MCD
            if (valorA % i == 0 && valorB % i == 0) {
                mcd = i;
            }
            i++;
        }

        System.out.println("El MCD de " + valorA + " y " + valorB + " es: " + mcd);
    }
}
