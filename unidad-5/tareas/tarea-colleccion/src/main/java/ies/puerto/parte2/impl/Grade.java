package ies.puerto.parte2.impl;

import java.util.Objects;

/**
 * Class containing information about student's grades
 * @author Jose Maximiliano Boada Martin
 */
public class Grade {
    /**
     * Properties
     */
    private String nameOfSubject;
    private float gradeValue;

    /**
     * Default constructor
     */
    public Grade() {}

    /**
     * Constructor with all relevant parameters
     * @param nameOfSubject self-explanatory
     * @param gradeValue self-explanatory
     */
    public Grade(String nameOfSubject, float gradeValue) {
        this.nameOfSubject = nameOfSubject;
        this.gradeValue = gradeValue;
    }

    /**
     * Getters and setters
     */
    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public float getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(float gradeValue) {
        this.gradeValue = gradeValue;
    }

    @Override
    public String toString() {
        return "{Subject: " + nameOfSubject + ", Grade: " + gradeValue + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return Float.compare(gradeValue, grade.gradeValue) == 0 && Objects.equals(nameOfSubject, grade.nameOfSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSubject, gradeValue);
    }
}
