package ies.puerto.ejercicio6.impl;

import ies.puerto.ejercicio6.abstractas.Employee;

/**
 * Professor class that extends from employee
 * @author Jose Maximiliano Boada Martin
 */
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
     * Constructor with name, salary, job and specialty parameters
     * @param name of professor
     * @param salary of professor
     * @param job of professor
     * @param specialty of professor
     */
    public Professor(String name, float salary, String job, String specialty) {
        super(name, salary, job);
        this.specialty = specialty;
    }

    /**
     * Constructor with name, date of birth, job and specialty parameters
     * @param name of professor
     * @param dateOfBirth of professor
     * @param job of professor
     * @param specialty of professor
     */
    public Professor(String name, String dateOfBirth, String job, String specialty) {
        super(name, dateOfBirth, job);
        this.specialty = specialty;
    }

    /**
     * Constructor with all relevant parameters
     * @param name of professor
     * @param dateOfBirth of professor
     * @param salary of professor
     * @param job of professor
     * @param specialty of professor
     */
    public Professor(String name, String dateOfBirth, float salary, String job, String specialty) {
        super(name, dateOfBirth, salary, job);
        this.specialty = specialty;
    }

    /**
     * Prints lesson message
     * @return lesson message
     */
    public String impartLesson() {
        return "Imparting lesson...";
    }

    /**
     * Calculates salary
     * @return salary
     */
    @Override
    public float calcSalary() {
        return 1000f;
    }

    /**
     * Work method from worker interface
     * @return working message
     */
    @Override
    public String work() {
        return "Working...";
    }

    /**
     * Prints professor info
     * @return professor info
     */
    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nDate of birth: " + getDateOfBirth() +
                "\nSalary: " + getSalary() +
                "\nJob: " + getJob() +
                "\nSpecialty: " + specialty;
    }
}
