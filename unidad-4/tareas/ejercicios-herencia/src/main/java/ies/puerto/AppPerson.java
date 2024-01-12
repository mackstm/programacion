package ies.puerto;

import exceptions.ValidationException;

import java.util.ArrayList;
import java.util.List;

/**
 * Tests behavior of Person class and its children
 * @author Jose Maximiliano Boada Martin
 */
public class AppPerson {
    public static void main(String[] args) throws ValidationException {
        Person person = new Person("Pepe", 27, "11111111A");
        List<Float> grades = new ArrayList<>();
        grades.add(5.0f);
        grades.add(6.4f);
        Student student = new Student("Pablo", 18, "22222222B", "1ºA", grades);
        System.out.println(person);
        System.out.println(student);

        System.out.println(person.greet());
        System.out.println(student.greet());

        person.validateUser();
        System.out.println("Valid user");
        student.validateUser();
        System.out.println("Valid user");
    }
}
