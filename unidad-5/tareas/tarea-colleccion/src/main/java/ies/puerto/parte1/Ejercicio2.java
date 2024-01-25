package ies.puerto.parte1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * Arraylist with strings, print only elements that start by the letter 'A'
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio2 {
    static List<String> stringList;
    public static void main(String[] args) {
        stringList = new ArrayList<>();
        Collections.addAll(stringList, "Aguacate", "Barbie", "Apocalipsis", "Apapapapapapap");
        System.out.println(stringList);
        int counter = 0;
        for (String str : stringList) {
            if (startsWithA(str)) {
                counter++;
            }
        }
        System.out.println("Number of elements that start with A: " + counter);
    }

    /**
     * Checks whether given string starts with A
     * @param str to check
     * @return true or false
     */
    public static boolean startsWithA(String str) {
        String regex = "^[aA].*";
        return Pattern.matches(regex, str);
    }

}
