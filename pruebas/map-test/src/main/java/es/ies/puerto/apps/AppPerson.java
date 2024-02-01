package es.ies.puerto.apps;

import es.ies.puerto.maps.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppPerson {
    static Map<String, Person> personHashMap;
    static List<Person> personList;
    public static void main(String[] args) {
        personHashMap = new HashMap<>();
        personList = new ArrayList<>();
    }

    public boolean addPersonList(Person person) {
        return true;
    }
}
