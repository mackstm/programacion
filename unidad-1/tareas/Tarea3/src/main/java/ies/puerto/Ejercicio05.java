package ies.puerto;

import java.util.Scanner;

/**
 * @author José Maximiliano Boada Martín
 *
 * Escribe un programa en Java que imprima los primeros n términos de la secuencia de Fibonacci. Se debe solicitar el número n por teclado.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int limit;

        System.out.println("Introduzca hasta qué posición quiere imprimir la secuencia de Fibonacci: ");
        limit = read.nextInt();

        // Inizializamos los dos primeros valores de la secuencia de Fibonacci
        int fibo1 = 0, fibo2 = 1;

        // Sumamos para adelantar la secuencia. El número que acabaremos imprimiendo será fibo1, mientras que fibo2 siempre irá por delante
        for (int i = 0; i < limit; i++) {
            System.out.print(fibo1 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
    }
}
