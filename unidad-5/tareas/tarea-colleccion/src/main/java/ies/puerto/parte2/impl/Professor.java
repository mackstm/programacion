package ies.puerto.parte2.impl;

import ies.puerto.parte2.abstracts.Employee;

public class Professor extends Employee {
    /**
     * Properties
     */
    private String specialty;

    /**
     * Default constructor
     */
    public Professor() {}

    /**
     * Constructor with all relevant parameters
     * @param dni of professor
     * @param name of professor
     * @param dateOfBirth of professor
     * @param salary of professor
     * @param specialty of professor
     */
    public Professor(String dni, String name, String dateOfBirth, float salary, String specialty) {
        super(dni, name, dateOfBirth, salary);
        this.specialty = specialty;
    }

    /**
     * Getters and setters
     */
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "{DNI:" + getDni() +
                ", name: " + getName() +
                ", date of birth: " + getDateOfBirth() +
                ", age: " + calcAge() +
                ", salary: " + getSalary() +
                ", specialty: " + specialty + "}";
    }
}
