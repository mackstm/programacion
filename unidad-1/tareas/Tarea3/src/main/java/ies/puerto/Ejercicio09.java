package ies.puerto;

import java.util.Scanner;

/**
 * @author José Maximiliano Boada Martín
 *
 * Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for.
 * Solicita el valor de la tabla por teclado.
 */
public class Ejercicio09 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int numero;

        System.out.println("Introduzca el número del que desea ver la tabla de multiplicar: ");
        numero = read.nextInt();

        // Bucle for que imprime la tabla
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + "= " + (numero * i));
        }

    }
}
