package ies.puerto.parte2.impl;

import ies.puerto.parte2.abstracts.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Student class for exercise 3 (class tested in package ej6 with AppClasroom)
 * @author Jose Maximiliano Boada Martin
 */
public class Student extends Person {
    /**
     * Properties
     */
    private List<Grade> grades;

    /**
     * Default constructor
     */
    public Student() {}

    /**
     * Constructor with all parameters except grades
     * @param dni of student
     * @param name of student
     * @param dateOfBirth of student
     */
    public Student(String dni, String name, String dateOfBirth) {
        super(dni, name, dateOfBirth);
        grades = new ArrayList<>();
    }

    /**
     * Constructor with all relevant parameters
     * @param dni of student
     * @param name of student
     * @param dateOfBirth of student
     * @param grades of student
     */
    public Student(String dni, String name, String dateOfBirth, List<Grade> grades) {
        super(dni, name, dateOfBirth);
        this.grades = grades;
        deleteDupes();
    }

    /**
     * Getters and setters
     */
    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    /**
     * Calculates average grade from grade list
     * @return average of grades
     */
    public float average() {
        float result = 0;
        if (grades.isEmpty()) {
            return result;
        }
        for (Grade grade : grades) {
            result += grade.getGradeValue();
        }
        return result / grades.size();
    }

    /**
     * Deletes duplicates from list
     */
    public void deleteDupes() {
        List<Grade> temp = grades;
        grades = new ArrayList<>();

        for (Grade grade : temp) {
            if(!grades.contains(grade)) {
                grades.add(grade);
            }
        }
    }

    @Override
    public String toString() {
        return "{DNI:" + getDni() +
                ", name: " + getName() +
                ", date of birth: " + getDateOfBirth() +
                ", age: " + calcAge() +
                ", grades: " + grades;
    }
}
