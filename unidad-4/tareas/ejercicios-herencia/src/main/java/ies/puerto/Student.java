package ies.puerto;

import exceptions.ValidationException;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Student class, inherits from parent (Person)
 * @author Jose Maximiliano Boada Martin
 */
public class Student extends Person{
    /**
     * Properties
     */
    private String yearGrade;
    private List<Float> grades;

    /**
     * Default constructor
     */
    public Student() {}

    /**
     * Constructor with name, age, and dni parameters. Uses parent's constructor
     * @param name of student
     * @param age of student
     * @param dni of student
     */
    public Student(String name, int age, String dni) {
        super(name, age, dni);
    }

    /**
     * Constructor with all parameters. Uses parent's constructor
     * @param name of student
     * @param age of student
     * @param dni of student
     * @param yearGrade of student
     * @param grades of student
     */
    public Student(String name, int age, String dni, String yearGrade, List<Float> grades) {
        super(name, age, dni);
        this.yearGrade = yearGrade;
        this.grades = grades;
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

    public List<Float> getGrades() {
        return grades;
    }

    public void setGrades(List<Float> grades) {
        this.grades = grades;
    }

    /**
     * Student greeting, overrides generic greeting from Person class
     * @return personalized greeting
     */
    @Override
    public String greet() {
        return "I am a student, my name is " + getName() + " from " + yearGrade;
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
        System.out.println("Input your current grade: ");
        String yearGradeInput = read.next();

        return nameInput + dniInput + yearGradeInput;
    }

    /**
     * User validation. Overrides method from Authentication class
     */
    @Override
    public void validateUser() throws ValidationException {
        if (!readInput().equals(getName() + getDni() + yearGrade)) {
            throw new ValidationException("INVALID USER");
        }
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nDNI: " + getDni() +
                "\nCurrent grade: " + yearGrade +
                "\nGrades: " + grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(yearGrade, student.yearGrade) && Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), yearGrade, grades);
    }
}
