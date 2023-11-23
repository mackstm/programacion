package ies.puerto;

import java.util.Scanner;

/**
 * Array of 10, stop reading inputs when inputting a negative number. Print array afterward
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio2 {
    /**
     * Reads grade data from keyboard and prints after
     */
    public void readAndPrintData() {
        int[] array = new int[10];
        Scanner read = new Scanner(System.in);
        int i = 0;
        boolean out = false;
        do {
            System.out.println("Introduzca el valor " + (i + 1) + ": ");
            int temp = read.nextInt();

            if (temp < 0) {
                out = true;

            } else {
                array[i] = temp;
                i++;
            }
        } while (i < array.length && !out);
        showArray(array, i);
    }

    /**
     * Prints array
     * @param array of integers
     * @param size of array
     */
    public void showArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("Grade " + (i + 1) + ": " + array[i]);
        }
    }
}
