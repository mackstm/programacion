import java.util.Scanner;

/**
 * @author jmboada
 *
 * Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente.
 * El algoritmo debe imprimir cual es el mayor y cual es el menor.
 * Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos.
 * Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int valorA;
        int valorB;
        int valorC;

        Scanner lectura = new Scanner(System.in);

        do {
            System.out.println("Ingrese el valor de la variable A: ");
            valorA = lectura.nextInt();
            System.out.println("Valor de la variable A: " +valorA);

            System.out.println("Ingrese el valor de la variable B: ");
            valorB = lectura.nextInt();
            System.out.println("Valor de la variable B: " +valorB);

            System.out.println("Ingrese el valor de la variable C: ");
            valorC = lectura.nextInt();
            System.out.println("Valor de la variable B: " +valorC);

            if ((valorA == valorB) || (valorA == valorC) || (valorB == valorC)) {
                System.out.println("Los valores introducidos son iguales, vuelva a introducirlos");
            }

        }while ((valorA == valorB) || (valorA == valorC) || (valorB == valorC));


    }
}