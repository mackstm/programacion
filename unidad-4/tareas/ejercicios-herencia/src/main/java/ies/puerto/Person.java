package ies.puerto;

import access.Authentication;
import exceptions.ValidationException;

import java.util.Objects;
import java.util.Scanner;

/**
 * Person class
 * @author José Maximiliano Boada Martín
 */
public class Person extends Authentication{
    /**
     * Properties
     */
    private String name;
    private int age;
    private String dni;

    /**
     * Default constructor
     */
    public Person() {}

    /**
     * Constructor with name, age and DNI parameters
     * @param name of person
     * @param age of person
     * @param dni of person
     */
    public Person(String name, int age, String dni) {
        this.name = name;
        this.age = age;
        this.dni = dni;
    }

    /**
     * Getters and setters
     */
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Generic greeting
     * @return greeting
     */
    public String greet() {
        return "Hello! My name is " + name;
    }

    /**
     * Input read for authentication. Override of method from Authentication class
     * @return input
     */
    @Override
    public String readInput() {
        Scanner read = new Scanner(System.in);
        System.out.println("Input your name: ");
        String nameInput = read.next();
        System.out.println("Input your DNI: ");
        String dniInput = read.next();

        return nameInput + dniInput;
    }

    /**
     * User validation. Overrides method from Authentication class
     */
    @Override
    public void validateUser() throws ValidationException {
        if (!readInput().equals(name + dni)) {
            throw new ValidationException("INVALID USER");
        }
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nAge: " + age +
                "\nDNI: " + dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dni);
    }
}