package ies.puerto;

import java.util.Date;
import java.util.Objects;

/**
 * Testing lists with Person class
 * @author Jose Maximiliano Boada Martin
 */
public class Person {
    String dni;
    String name;
    String firstLastName;
    String secondLastName;

    public Person() {}

    public Person(String dni, String name, String firstLastName, String secondLastName) {
        this.dni = dni;
        this.name = name;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
    }

    @Override
    public String toString() {
        return "{DNI: " + dni +
                ", Name: " + name +
                ", Last names: " + firstLastName + " " + secondLastName + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni + new Date());
    }
}
