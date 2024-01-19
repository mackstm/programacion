package ies.puerto.ejercicio6.impl;

import ies.puerto.ejercicio6.abstractas.Person;

/**
 * Class containing student information
 * @author Jose Maximiliano Boada Martin
 */
public class Student extends Person {
    /**
     * Properties
     */
    private String yearGrade;

    /**
     * Default constructor
     */
    public Student() {}

    /**
     * Constructor with name and grade
     * @param name of student
     * @param yearGrade of student
     */
    public Student(String name, String yearGrade) {
        super(name);
        this.yearGrade = yearGrade;
    }

    /**
     *
     * @param name of student
     * @param dateOfBirth of student
     * @param yearGrade of student
     */
    public Student(String name, String dateOfBirth, String yearGrade) {
        super(name, dateOfBirth);
        this.yearGrade = yearGrade;
    }

    /**
     * Getters and setters
     */
    public String getYearGrade() {
        return yearGrade;
    }

    public void setYearGrade(String yearGrade) {
        this.yearGrade = yearGrade;
    }

    /**
     * Returns studying message
     * @return study message
     */
    public String study() {
        return "Studying...";
    }

    /**
     * Prints student info
     * @return student info
     */
    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nDate of birth: " + getDateOfBirth() +
                "\nAge: " + calcAge() +
                "\nCurrent Grade: " + yearGrade;
    }
}
