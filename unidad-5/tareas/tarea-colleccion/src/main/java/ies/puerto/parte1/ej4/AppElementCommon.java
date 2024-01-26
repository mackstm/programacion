package ies.puerto.parte1.ej4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Compare two integer lists and return true if they have one element in common
 * @author Jose Maximiliano Boada Martin
 */
public class AppElementCommon {
    static List<Integer> integerList1;
    static List<Integer> integerList2;
    public static void main(String[] args) {
        integerList1 = new ArrayList<>(Arrays.asList(58, 90, 13, 4, 95));
        integerList2 = new ArrayList<>(Arrays.asList(48, 32, 2, 3, 4, 68, 100, 124, 23, 213, 2345, 5, 5, 3));
        List<Integer> differentList = new ArrayList<>(Arrays.asList(2, 1, 3, 5));

        System.out.println("Lists have elements in common: " + elementInCommon(integerList1, integerList2));
        System.out.println("Lists have elements in common: " + elementInCommon(integerList1, differentList));
    }

    /**
     * Checks whether lists have an element in common
     * @param numbers1 list
     * @param numbers2 list
     * @return true or false
     */
    public static boolean elementInCommon(List<Integer> numbers1, List<Integer> numbers2) {
        if (numbers1.size() < numbers2.size()) {
            List<Integer> temp = numbers1;
            numbers1 = numbers2;
            numbers2 = temp;
        }

        for (Integer number : numbers1) {
            if (numbers2.contains(number)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Recursive version of elementInCommon function
     * @param numbers1 list
     * @param numbers2 list
     * @return true or false
     */
    public static boolean elementInCommonRecursive(List<Integer> numbers1, List<Integer> numbers2) {
        if (numbers1.size() < numbers2.size()) {
            return elementInCommonRecursive(numbers2, numbers1);
        }

        for (Integer number : numbers1) {
            if (numbers2.contains(number)) {
                return true;
            }
        }

        return false;
    }

}