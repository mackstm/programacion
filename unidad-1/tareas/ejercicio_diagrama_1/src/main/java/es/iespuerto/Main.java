package es.iespuerto;
import java.util.Scanner;

/**
 * Clase que realiza el primer ejercicio de las tareas
 */
public class Main {
    public static void main(String[] args) {

        int valorA;
        int valorB;

        Scanner lectura = new Scanner(System.in);

        //Bloque 1: pide valor por pantalla y asigna valor
        do {
            System.out.println("Ingrese el valor de la variable A: ");
            valorA = lectura.nextInt();
            System.out.println("Valor de la variable A: " +valorA);

            System.out.println("Ingrese el valor de la variable B: ");
            valorB = lectura.nextInt();
            System.out.println("Valor de la variable B: " +valorB);

            if (valorA == valorB) {
                System.out.println("Los valores introducidos son iguales, vuelva a introducirlos");
            }

            //Bloque 2: verifica si los valores son iguales
        } while(valorA == valorB);


        //Bloque 3: verifica si A > B
        if (valorA > valorB) {
            System.out.println("El valor de A es mayor");
        } else  {
            System.out.println("El valor de B es mayor");
        }


        //Bloque 4: muestra por pantalla el valor mayor

    }
}