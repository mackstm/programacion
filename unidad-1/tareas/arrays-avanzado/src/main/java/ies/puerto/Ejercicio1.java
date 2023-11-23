package ies.puerto;

import java.util.Scanner;

/**
 * array with student grades, calculate average grades, highest and lowers.
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio1 {
    /**
     * Reads grade data from keyboard
     */
    public float[] readData() {
        float[] array = new float[5];

        Scanner read = new Scanner(System.in);

        int i = 0;
        do {
            System.out.println("Introduzca el valor " + (i + 1) + ": ");
            float temp = read.nextFloat();

            if ((temp >= 0) && (temp <= 10)) {
                array[i] = temp;
                i++;
            }
        } while (i < array.length);
        return array;
    }

    /**
     * Calculates grade average
     * @param array of grades
     * @return average of grades
     */
    public float averageGrade(float[] array) {
        float sum = 0;
        for (float grade : array) {
            sum += grade;
        }
        return sum / array.length;
    }

    /**
     * Prints grade array on screen
     * @param array of grades
     */
    public void showArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Grade " + (i + 1) + ": " + array[i]);
        }
    }

    /**
     * Calculates the maximum grade in array
     * @param array of grades
     * @return max of grades
     */
    public float maxGrade(float[] array) {
        float max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Calculates the minimum grade in array
     * @param array of grades
     * @return min of grades
     */
    public float minGrade(float[] array) {
        float min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}