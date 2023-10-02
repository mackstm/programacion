package ies.puerto;
import java.util.Scanner;

/**
 * Desarrolle un algoritmo que permita calcular
 * Promedio de Notas; finaliza cuando N = 0.
 */
public class Ejercicio8 {
    public static void main(String[] args){
        int nAsignaturas; // Inicializacion de variable donde almacenaremos el numero de asignaturas

        // Peticion de nAsignaturas por teclado
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el número de asignaturas: ");
        nAsignaturas = read.nextInt();

        // Inicializacion de sum y el contador
        float sum = 0;
        int i = 0;

        // Bucle que acumula sum. Si el número de asignaturas es 0, se lo salta
        while (nAsignaturas != 0 && i < nAsignaturas) {
            System.out.println("Introduzca la nota de la asignatura " + (i + 1));
            sum += read.nextFloat();
            i++;
        }

            // Calculo de la media
            float media = sum / nAsignaturas;

            // Se imprime la media por pantalla
            System.out.println("Nota media: " + media);
    }
}
