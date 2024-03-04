package es.ies.puerto.model;

import es.ies.puerto.utilities.UtilitiesClass;

/**
 * Person class
 * @author Jose Maximiliano Boada Martin
 */
public class Person extends UtilitiesClass {
    /**
     * Properties
     */
    int id;
    String name;
    int age;
    String email;

    /**
     * Default constructor
     */
    public Person() {}

    /**
     * Constructor used for searching
     * @param id of Person
     */
    public Person(int id) {
        this.id = id;
    }

    /**
     * Constructor with all parameters
     * @param id of person
     * @param name of person
     * @param age of person
     * @param email of person
     */
    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person persona = (Person) o;

        return id == persona.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public String toCsv() {
        return id + DELIMIT + name + DELIMIT + age + DELIMIT + email;
    }
}
