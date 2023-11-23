package ies.puerto;

/**
 * Program that finds number 7 in array using break
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int wantedNumber = 7;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == wantedNumber) {
                System.out.println("Wanted number found: " + wantedNumber + "\nPosition: " + i);
                break;
            }
        }
    }
}
