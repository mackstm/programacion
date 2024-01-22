package ies.puerto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * List trial
 * @author Jose Maximiliano Boada Martin
 */
public class AppList {
    static List<Integer> myIntegerList;

    public static void main(String[] args) {
        myIntegerList = new ArrayList<>();
        addElement(1);
        addElement(2);
        List<Integer> sublist = new ArrayList<>();
        sublist.add(3);
        sublist.add(4);
        addSublist(sublist);
        System.out.println(myIntegerList);
    }

    public static boolean addElement(Integer element) {
        return myIntegerList.add(element);
    }

    public static boolean removeElement(Integer element) {
        return myIntegerList.remove(element);
    }

    public static boolean addSublist(Collection sublist) {
        return myIntegerList.addAll(sublist);
    }
}
