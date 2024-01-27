package ies.puerto.parte2.impl;

import ies.puerto.parte1.ej9.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * School class with multiple classrooms
 * @author Jose Maximiliano Boada Martin
 */
public class School {
    /**
     * Properties
     */
    private String name;
    private String address;
    private String location;
    private List<Classroom> classrooms;

    /**
     * Default constructor
     */
    public School() {}

    /**
     * Constructor with all relevant parameters
     * @param name of school
     * @param address of school
     * @param location of school
     * @param classrooms of school
     */
    public School(String name, String address, String location, List<Classroom> classrooms) {
        this.name = name;
        this.address = address;
        this.location = location;
        this.classrooms = classrooms;
        deleteDupes();
    }

    /**
     * Getters and setters
     */
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getLocation() {
        return location;
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    /**
     * Obtains the max grade number in the entire school
     * @return max grade
     */
    public float maxGrade() {
        if (classrooms.isEmpty()) {
            return 0;
        }
        float max = 0;
        for (Classroom classroom : classrooms) {
            for (Student student : classroom.getStudents()) {
                for (Grade grade : student.getGrades()) {
                    if (max < grade.getGradeValue()) {
                        max = grade.getGradeValue();
                    }
                }
            }
        }
        return max;
    }

    /**
     * Calculates average salary of every professor
     * @return average salary
     */
    public float averageSalary() {
        float result = 0;
        if (classrooms.isEmpty()) {
            return result;
        }
        for (Classroom classroom : classrooms) {
            result += classroom.getProfessor().getSalary();
        }
        return result / classrooms.size();
    }

    /**
     * Returns max salary among all professors
     * @return max salary
     */
    public float maxSalary() {
        if (classrooms.isEmpty()) {
            return 0;
        }
        float max = 0;
        for (Classroom classroom : classrooms) {
            if (max < classroom.getProfessor().getSalary()) {
                max = classroom.getProfessor().getSalary();
            }
        }
        return max;
    }

    /**
     * Returns minimum salary among all professors
     * @return minimum salary
     */
    public float minSalary() {
        if (classrooms.isEmpty()) {
            return 0;
        }
        float min = classrooms.get(0).getProfessor().getSalary();
        for (Classroom classroom : classrooms) {
            if (min > classroom.getProfessor().getSalary()) {
                min = classroom.getProfessor().getSalary();
            }
        }
        return min;
    }

    /**
     * Calculates average grades of every student in the school
     * @return average
     */
    public float average() {
        float result = 0;
        if (classrooms.isEmpty()) {
            return result;
        }
        for (Classroom classroom : classrooms) {
            result += classroom.average();
        }
        return result / classrooms.size();
    }

    /**
     * Searches for professor
     * @param professor to search
     * @return found professor
     */
    public Professor searchProfessor(Professor professor) {
        for (Classroom classroom : classrooms) {
            if (classroom.getProfessor().equals(professor)) {
                return classroom.getProfessor();
            }
        }
        return null;
    }

    /**
     * Searches for professor by dni
     * @param dni of professor to search
     * @return found professor
     */
    public Professor searchProfessor(String dni) {
        Professor professor = new Professor(dni, "", "", 0f, "");
        return searchProfessor(professor);
    }

    /**
     * Searches for student
     * @param student to search
     * @return found student
     */
    public Student searchStudent(Student student) {
        for (Classroom classroom : classrooms) {
            for (Student studentElement : classroom.getStudents()) {
                if (studentElement.equals(student)) {
                    return studentElement;
                }
            }
        }
        return null;
    }

    /**
     * Searches for student by dni
     * @param dni of student to search
     * @return found student
     */
    public Student searchStudent(String dni) {
        Student student = new Student(dni, "", "");
        return searchStudent(student);
    }

    /**
     * Searches for classroom
     * @param classroom to search
     * @return found classroom
     */
    public Classroom searchClassroom(Classroom classroom) {
        for (Classroom classroomElement : classrooms) {
            if (classroomElement.equals(classroom)) {
                return classroomElement;
            }
        }
        return null;
    }

    /**
     * Searches for classroom by name
     * @param name of classroom to search
     * @return found classroom
     */
    public Classroom searchClassroom(String name) {
        Classroom classroom = new Classroom(name);
        return searchClassroom(classroom);
    }

    /**
     * Calculates average age among all students and professors in the school
     * @return average age
     */
    public int averageAge() {
        int result = 0;
        if (classrooms.isEmpty()) {
            return result;
        }
        int counter = 0;
        for (Classroom classroom : classrooms) {
            result += classroom.getProfessor().calcAge();
            counter++;
            for (Student student : classroom.getStudents()) {
                result += student.calcAge();
                counter++;
            }
        }

        return result / counter;
    }

    /**
     * Deletes duplicates from list
     */
    public void deleteDupes() {
        List<Classroom> temp = classrooms;
        classrooms = new ArrayList<>();

        for (Classroom classroom : temp) {
            if(!classrooms.contains(classroom)) {
                classrooms.add(classroom);
            }
        }
    }

    @Override
    public String toString() {
        return "{School name: " + name +
                ", Address: " + address +
                ", Location: " + location +
                ", Classrooms: " + classrooms +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(name, school.name) && Objects.equals(address, school.address) &&
                Objects.equals(location, school.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, location);
    }
}
