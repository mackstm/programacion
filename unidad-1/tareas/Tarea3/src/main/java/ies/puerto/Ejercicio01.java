package ies.puerto;

/**
 * @author José Maximiliano Boada Martín
 */

/**
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
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                sum++;
                System.out.print(sum + " ");
            }
            System.out.print("\n\n");
        }
    }
}
