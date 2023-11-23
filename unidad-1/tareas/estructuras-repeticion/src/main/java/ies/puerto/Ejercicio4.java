package ies.puerto;

/**
 * Program to find first negative number in an array
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -1, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.println("First negative number in array: " + array[i] + "\nPosition: " + i);
                break;
            }
        }
    }
}
