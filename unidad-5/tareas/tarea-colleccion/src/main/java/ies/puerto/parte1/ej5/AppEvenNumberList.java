package ies.puerto.parte1.ej5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create a method that receives a list of numbers and returns a list of even numbers
 * @author Jose Maximiliano Boada Martin
 */
public class AppEvenNumberList {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("The full list is: " + numberList);
        System.out.println("The list with only even numbers is: " + makeEvenList(numberList));
    }

    public static List<Integer> makeEvenList(List<Integer> numberList) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numberList) {
            if (number % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }
}
