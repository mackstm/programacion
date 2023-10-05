package ies.puerto;

/**
 * @author José Maximiliano Boada Martín
 *
 * Escribe un programa en Java que imprima el patrón siguiente:
 *
 * 1
 *
 * 2 3
 *
 * 4 5 6
 *
 * 7 8 9 10
 */
public class Ejercicio01 {
    public static void main(String[] args) {

        int sum = 1;

        // Bucle para el salto de linea
        for (int i = 0; i < 4; i++) {

            // Bucle anidado para imprimir cada secuencia
            for (int j = 0; j <= i; j++) {
                System.out.print(sum + " ");
                sum++;
            }

            System.out.print("\n\n");
        }
    }
}
