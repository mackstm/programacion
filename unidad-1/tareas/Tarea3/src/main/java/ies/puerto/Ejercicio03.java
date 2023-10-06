package ies.puerto;

import java.util.Scanner;

/**
 * @author José Maximiliano Boada Martín
 *
 * Escribe un programa en Java que encuentre el número de Fibonacci en la posición n.  Se debe solicitar el número por teclado.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int posicion;

        System.out.println("Introduzca la posición del número de Fibonacci: ");
        posicion = read.nextInt();

        // Inizializamos los dos primeros valores de la secuencia de Fibonacci
        int fibo1 = 0, fibo2 = 1;

        // Sumamos para adelantar la secuencia. El número que acabaremos imprimiendo será fibo1, mientras que fibo2 siempre irá por delante
        for (int i = 1; i < posicion; i++) {
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }

        System.out.println("El número de Fibonacci de la posición " + posicion + " es: " + fibo1);
    }
}
