package ies.puerto;

/**
 * Student class
 * @author Jose Maximiliano Boada Martin
 */
public class Student {
    /**
     * Properties
     */
    private String name;
    private int age;
    private String degree;
    private float averageGrades;

    /**
     * Default constructor
     */
    public Student() {}

    /**
     * Constructor with name, age, degree and average parameters
     * @param name of student
     * @param age of student
     * @param degree of student
     * @param averageGrades of student
     */
    public Student(String name, int age, String degree, float averageGrades) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.averageGrades = averageGrades;
    }

    /**
     * Getters and setters
     */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDegree() {
        return degree;
    }

    public float getAverageGrades() {
        return averageGrades;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setAverageGrades(float averageGrades) {
        this.averageGrades = averageGrades;
    }

    public String printDetails() {
        return "Name: " + name + "\nAge: " + "\nDegree: " + degree + "\nAverage of grades: " + averageGrades;
    }

    public boolean isPassed() {
        return averageGrades >= 5;
    }
}
