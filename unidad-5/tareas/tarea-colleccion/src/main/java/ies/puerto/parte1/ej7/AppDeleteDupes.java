package ies.puerto.parte1.ej7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Deletes duplicates from arraylist of strings
 * @author Jose Maximiliano Boada Martin
 */
public class AppDeleteDupes {
    static List<String> list;
    public static void main(String[] args) {
        list = new ArrayList<>(Arrays.asList("milk", "water", "eggs", "eggs", "eggs", "water", "bread"));
        System.out.println("List with no duplicates: " + deleteDupeStrings(list));
    }

    public static List<String> deleteDupeStrings(List<String> strList) {
        List<String> result = new ArrayList<>();

        for (String str : strList) {
            if(!result.contains(str)) {
                result.add(str);
            }
        }

        return result;
    }
}
