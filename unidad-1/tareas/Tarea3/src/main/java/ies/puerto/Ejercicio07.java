package ies.puerto;

import java.util.Scanner;

/**
 * @author José Maximiliano Boada Martín
 *
 * Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura switch.
 * El día a verificar se debe de pedir por teclado.
 */
public class Ejercicio07 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        short numDia;

        System.out.println("Introduzca el número correspondiente al día de la semana deseado:");
        numDia = read.nextShort();

        // Revisa la variable numDia para imprimir el día de la semana. Si no se introduce un número entre el 1 y el 7,
        // finaliza el programa
        switch (numDia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El número introducido no corresponde a ningún día de la semana.");
        }
    }
}
