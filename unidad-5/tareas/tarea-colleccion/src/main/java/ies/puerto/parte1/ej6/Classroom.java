package ies.puerto.parte1.ej6;

import ies.puerto.parte1.ej3.Student;

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
    private String id;
    private List<Student> students;

    /**
     * Default constructor
     */
    public Classroom() {}

    /**
     * Constructor with only ID
     * @param id of classroom
     */
    public Classroom(String id) {
        this.id = id;
        students = new ArrayList<>();
    }

    /**
     * Constructor with classroom ID and students
     * @param id of classroom
     * @param students of classroom
     */
    public Classroom(String id, List<Student> students) {
        this.id = id;
        this.students = students;
    }

    /**
     * Getters and setters
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
            result = student.average();
        }
        return result / students.size();
    }

    @Override
    public String toString() {
        return "Classroom ID: " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Classroom classroom = (Classroom) o;

        return Objects.equals(id, classroom.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
