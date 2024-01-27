package ies.puerto.parte1.ej10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Creation of method that reads names from user input to add to a list and sort alphabetically
 * @author Jose Maximiliano Boada Martin
 */
public class AppNameList {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Input number of names in list: ");
        int size = read.nextInt();
        List<String> nameList = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            System.out.println("Input name " + i + ": ");
            nameList.add(read.next());
        }
        nameList.sort(String::compareToIgnoreCase);
        System.out.println(nameList);
    }
}
