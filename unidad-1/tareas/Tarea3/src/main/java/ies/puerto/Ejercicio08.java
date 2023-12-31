package ies.puerto;

import java.util.Scanner;

/**
 * @author José Maximiliano Boada Martín
 *
 * Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. Solicita el límite por teclado.
 */
public class Ejercicio08 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int limInferior, limSuperior;

        // Pedimos por pantalla los límites del rango
        System.out.println("Introduzca el límite inferior del rango: ");
        limInferior = read.nextInt();
        System.out.println("Introduzca el límite superior del rango: ");
        limSuperior = read.nextInt();

        // Variable counter que solo se usará para imprimir el contador de números perfectos
        short counter = 0;

        // Bucle que se ejecutará contando desde 1 hasta 1000
        for(int i = limInferior; i <= limSuperior; i++) {

            int sum = 0;

            // Bucle anidado que acumulará sum cuando encuentre un divisor a excepción del mismo número
            for(int j = 1; j < i; j++) {
                if(i % j == 0) {
                    sum += j;
                }
            }

            // Si la suma de los divisores es igual al número que se está evaluando en la iteración,
            // se imprime por pantalla
            if(sum == i) {
                counter++;
                System.out.print("Número perfecto " + counter + ": " + i + "\n");
            }
        }
    }
}
