package ies.puerto;

import java.util.Scanner;

/**
 * Clase que realiza el ejercicio numero 1 de las tareas
 */
public class Main {
    public static void main(String[] args) {
        // Inizialización de la variable en la que acumularemos la suma

        int sum = 0;

        // Bucle que se ejecutará contando desde 1 hasta 1000
        for(int i = 1; i <= 1000; i++) {

            // Bucle anidado que acumulará sum cuando encuentre un divisor a excepción del mismo número
            for(int j = 1; j < i; j++) {
                if(i % j == 0) {
                    sum = sum + j;
                }
            }

            // Si la suma de los divisores es igual al número que se está evaluando en la iteración,
            // se imprime por pantalla
            if(sum == i) {
                System.out.print(i + "\n");
            }

            // Se reinicia sum
            sum = 0;
        }
    }
}
