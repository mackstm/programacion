package ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * String list test
 * @author Jose Maximiliano Boada Martin
 */
public class AppStringList {
    static List<String> myStringList;

    public static void main(String[] args) {
        myStringList = new ArrayList<>();
        String dni1 = "00000000H";
        String dni2 = "12345678A";
        myStringList.add(dni1);
        myStringList.add(dni2);
        System.out.println(myStringList);
        if (exists("1234")) {
            System.out.println("Element " + dni1 + " exists in list: " + myStringList);
        }
    }

    public static boolean exists(String element) {
        return myStringList.contains(element);
    }
}
