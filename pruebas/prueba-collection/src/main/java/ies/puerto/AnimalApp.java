package ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class AnimalApp {
    static List<Person> animals;
    static List<String> dates;

    public static void main(String[] args) {
        String date1 = "22/01/2024";
        Person pepe = new Person("1234", "Pepe", "Pepito", "Pepaso");
        animals = new ArrayList<>();
        dates = new ArrayList<>();
        if (!dates.contains(date1)) {
            dates.add(date1);
        }
        if (!animals.contains(pepe)) {
            animals.add(pepe);
        }

        System.out.println(dates);
        System.out.println(animals);
    }
}
