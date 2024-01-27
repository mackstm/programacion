package ies.puerto.parte1.ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Student class for exercise 3 (class tested in package ej6 with AppClasroom)
 * @author Jose Maximiliano Boada Martin
 */
public class StudentPart1 {
    /**
     * Properties
     */
    private String name;
    private String lastName;
    private List<Float> grades;

    /**
     * Default constructor
     */
    public StudentPart1() {}

    /**
     * Constructor with name and last name parameters
     * @param name of student
     * @param lastName of student
     */
    public StudentPart1(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        grades = new ArrayList<>();
    }

    /**
     * Constructor with all relevant parameters
     * @param name of student
     * @param lastName of student
     * @param grades of student
     */
    public StudentPart1(String name, String lastName, List<Float> grades) {
        this.name = name;
        this.lastName = lastName;
        this.grades = grades;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Float> getGrades() {
        return grades;
    }

    public void setGrades(List<Float> grades) {
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
        for (Float grade : grades) {
            result += grade;
        }
        return result / grades.size();
    }

    @Override
    public String toString() {
        return "Name: " + name + ", last name: " + lastName + ", grades: " + grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentPart1 student = (StudentPart1) o;

        if (!Objects.equals(name, student.name)) return false;
        return Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
