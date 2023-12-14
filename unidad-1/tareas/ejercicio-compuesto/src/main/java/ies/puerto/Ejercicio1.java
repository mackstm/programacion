package ies.puerto;

import java.util.Scanner;

/**
 * Inverted triangle
 * @author Jose Maximiliano Boara Martin
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();

        Scanner read = new Scanner(System.in);

        int size = read.nextInt();
        if (size % 2 == 0) {
            size = size + 1;
        }
        char[][] hourGlassMatrix = ejercicio1.makeHourGlass(size);

        for (int i = 0; i < size + 1; i++) {
            for (int j = 0; j < size; j++) {
                if (hourGlassMatrix[i][j] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(hourGlassMatrix[i][j]);
                }
            }
            System.out.print("\n");
        }
    }

    public char[][] makeHourGlass(int size) {

        char[][] hourGlassMatrix = new char[size + 1][size];

        for (int i = 0; i < size + 1; i++) {
            for (int j = i; j < (size - i); j++) {
                hourGlassMatrix[i][j] = '*';
                hourGlassMatrix[size - i][j] = '*';
            }
        }



        return hourGlassMatrix;
    }
}
