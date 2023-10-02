package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolle un algoritmo que permita calcular
 * Promedio de Notas; finaliza cuando N = 0.
 */
public class Ejercicio8 {
    public static void main(String[] args){
        int n;
        do {
            Scanner read = new Scanner (System.in);

            System.out.println("Introduzca el número de asignaturas: ");
            n = read.nextInt();
            System.out.println("Número de asignaturas: " + n);

            float sum = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("Introduzca la nota de la asignatura " + (i + 1));
                sum += read.nextFloat();
            }

            float media = sum / n;

            System.out.println("Nota media: " + media);

        }while (n != 0);
    }

}
