package ies.puerto;

import java.util.Scanner;

/**
 * @author José Maximiliano Boada Martín
 *
 * Escribe un programa en Java que verifique si un número es palíndromo. Se debe solicitar el número por teclado.
 */
public class Ejercicio04 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int numero;

        System.out.println("Introduzca un número: ");
        numero = read.nextInt();

        int resto, inverso = 0, auxiliar = numero;

        // Bucle para obtener el número inverso.
        while (auxiliar > 0) {
            resto = auxiliar % 10;
            inverso = (inverso * 10) + resto;
            auxiliar /= 10;
        }

        if (inverso == numero) {
            System.out.println(numero + " es palíndromo");
        }
        else {
            System.out.println(numero + " no es palíndromo");
        }
    }
}
