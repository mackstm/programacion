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

    /**
     * Getters and setters
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
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
