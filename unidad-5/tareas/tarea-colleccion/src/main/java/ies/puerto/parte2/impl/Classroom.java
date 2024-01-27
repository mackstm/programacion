package ies.puerto.parte2.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Classroom with students
 * @author Jose Maximiliano Boada Martin
 */
public class Classroom {
    /**
     * Properties
     */
    private String name;
    private Professor professor;
    private List<Student> students;

    /**
     * Default constructor
     */
    public Classroom() {}

    /**
     * Constructor with name parameter
     * @param name of classroom
     */
    public Classroom(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    /**
     * Constructor with all relevant parameters
     * @param name of classroom
     * @param professor of classroom
     * @param students of classroom
     */
    public Classroom(String name, Professor professor, List<Student> students) {
        this.name = name;
        this.professor = professor;
        this.students = students;
        deleteDupes();
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * Average grade of entire class
     * @return average of class
     */
    public float average() {
        float result = 0;
        if (students.isEmpty()) {
            return result;
        }
        for (Student student : students) {
            result += student.average();
        }
        return result / students.size();
    }

    /**
     * Deletes duplicates from list
     */
    public void deleteDupes() {
        List<Student> temp = students;
        students = new ArrayList<>();

        for (Student student : temp) {
            if(!students.contains(student)) {
                students.add(student);
            }
        }
    }

    @Override
    public String toString() {
        return "{Classroom name: " + name +
                ", professor: " + professor.getName() +
                ", students: " + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom = (Classroom) o;
        return Objects.equals(name, classroom.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
