package ies.puerto;

/**
 * Class that stores and shows people's data
 * @author Jose Maximiliano Boada Martin
 */

public class Person {
    /**
     * Properties
     */
    private String name;
    private int age;
    private String email;
    private String phoneNumber;

    /**
     * Default constructor
     */
    public Person(){}

    /**
     * Constructor with name parameter
     * @param name of person
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Constructor with name and age parameters
     * @param name of person
     * @param age of person
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Constructor with name, age and email parameters
     * @param name of person
     * @param age of person
     * @param email of person
     */
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    /**
     * Constructor with name, age, email and phone number parameters
     * @param name of person
     * @param age of person
     * @param email of person
     * @param phoneNumber of person
     */
    public Person(String name, int age, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getters/Setters of class
     */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Prints details of person
     * @return string of details
     */
    public String printDetails() {
        return "Name: " + name + "\nAge: " + age + "\nEmail: " + email + "\nPhone number: " + phoneNumber;
    }
}
