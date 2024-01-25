package ies.puerto.parte1;


import java.util.ArrayList;
import java.util.List;

/**
 * Add even numbers from 1 to 10 to an array list
 * @author Jose Maximiliano Boada Martin
 */

public class Ejercicio1 {
    static List<Integer> evenNumberList;
    static List<Integer> oddNumberList;

    public static void main(String[] args) {
        evenNumberList = new ArrayList<>();
        oddNumberList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            if (isEven(i)) {
                evenNumberList.add(i);
            } else {
                oddNumberList.add(i);
            }
        }
        System.out.println(evenNumberList);
        System.out.println(oddNumberList);
        System.out.println("Size: " + evenNumberList.size());
        System.out.println("Size: " + oddNumberList.size());
    }

    /**
     * Checks if a number is even
     * @param number to check
     * @return true or false
     */
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}