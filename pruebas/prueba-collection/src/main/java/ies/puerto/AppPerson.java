package ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class AppPerson {
    static Person ramon;
    static Person juan;
    static String dni1 = "00000000T";
    static String dni2 = "11111111H";
    static List<Person> people;
    public static void main(String[] args) {
        ramon = new Person(dni1, "Ramon", "Gonzalez", "Perez");
        juan = new Person(dni2, "Juan", "Gonzalez", "Perez");
        people = new ArrayList<>();
        people.add(ramon);
        people.add(juan);
        System.out.println(people);
        Person ramon2 = new Person(dni1, "Ramon", "Gonzalez", "Perez");
        if (people.contains(ramon2)) {
            System.out.println("List contains " + ramon);
        }
    }
}
