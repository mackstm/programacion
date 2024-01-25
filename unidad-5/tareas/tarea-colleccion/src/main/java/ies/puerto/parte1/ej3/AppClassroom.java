package ies.puerto.parte1.ej3;

import java.util.Arrays;

/**
 * Tests student and classroom classes
 * @author Jose Maximiliano Boada Martin
 */
public class AppClassroom {
    static Classroom dam1;

    public static void main(String[] args) {
        dam1 = new Classroom("1DAM");

        Student student1 = new Student("name1", "lastname1", Arrays.asList(1f, 2f, 4f));
        Student student2 = new Student("name2", "lastname2", Arrays.asList(9f, 7f, 10f));
        dam1.setStudents(Arrays.asList(student1, student2));

        System.out.println("Clasroom average: " + dam1.average());
    }
}