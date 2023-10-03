import java.io.PrintStream;

/**
 * @author jmboada
 *
 * Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente.
 * El algoritmo debe imprimir cual es el mayor y cual es el menor.
 * Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos.
 * Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i + 1;
        }
        System.out.println("Suma en bucle for: "+sum);

        int i = 0;
        while (i < 10) {

            i++;
        }
    }
}
