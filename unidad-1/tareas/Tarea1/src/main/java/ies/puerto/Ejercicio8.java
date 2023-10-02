package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolle un algoritmo que permita calcular
 * Promedio de Notas; finaliza cuando N = 0.
 */
public class Ejercicio8 {
    public static void main(String[] args){
        int nAsignaturas;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el número de asignaturas: ");
        nAsignaturas = read.nextInt();
        float sum = 0;
        int i = 0;
        while (nAsignaturas != 0 && i < nAsignaturas) {
            System.out.println("Introduzca la nota de la asignatura " + (i + 1));
            sum += read.nextFloat();
            i++;
        }
            float media = sum / nAsignaturas;
            System.out.println("Nota media: " + media);
    }
}
