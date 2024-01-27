package ies.puerto.parte1.ej6;

import ies.puerto.parte1.ej3.StudentPart1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Classroom with students
 * @author Jose Maximiliano Boada Martin
 */
public class ClassroomPart1 {
    /**
     * Properties
     */
    private String id;
    private List<StudentPart1> students;

    /**
     * Default constructor
     */
    public ClassroomPart1() {}

    /**
     * Constructor with only ID
     * @param id of classroom
     */
    public ClassroomPart1(String id) {
        this.id = id;
        students = new ArrayList<>();
    }

    /**
     * Constructor with classroom ID and students
     * @param id of classroom
     * @param students of classroom
     */
    public ClassroomPart1(String id, List<StudentPart1> students) {
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

    public List<StudentPart1> getStudents() {
        return students;
    }

    public void setStudents(List<StudentPart1> students) {
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
        for (StudentPart1 student : students) {
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

        ClassroomPart1 classroom = (ClassroomPart1) o;

        return Objects.equals(id, classroom.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
