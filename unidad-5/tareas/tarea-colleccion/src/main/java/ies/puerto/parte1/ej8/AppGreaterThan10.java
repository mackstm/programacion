package ies.puerto.parte1.ej8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Creation of method that returns true if every single element in a list is greater than 10
 * @author Jose Maximiliano Boada Martin
 */
public class AppGreaterThan10 {
    public static void main(String[] args) {
        List<Integer> numberList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 11, 1000));
        List<Integer> numberList2 = new ArrayList<>(Arrays.asList(11, 12, 13, 14));
        System.out.println("All elements of the list " + numberList1 + " are greater than 10: " +
                isGreaterThan10(numberList1));
        System.out.println("All elements of the list " + numberList2 + " are greater than 10: " +
                isGreaterThan10(numberList2));
    }

    private static boolean isGreaterThan10(List<Integer> numberList) {
        for (Integer number : numberList) {
            if (number <= 10) {
                return false;
            }
        }
        return true;
    }


}
