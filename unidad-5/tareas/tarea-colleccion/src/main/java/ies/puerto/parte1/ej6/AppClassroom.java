package ies.puerto.parte1.ej6;

import ies.puerto.parte1.ej3.StudentPart1;

import java.util.Arrays;

/**
 * Tests student and classroom classes
 * @author Jose Maximiliano Boada Martin
 */
public class AppClassroom {
    static ClassroomPart1 dam1;

    public static void main(String[] args) {
        dam1 = new ClassroomPart1("1DAM");

        StudentPart1 student1 = new StudentPart1("name1", "lastname1", Arrays.asList(1f, 2f, 4f));
        StudentPart1 student2 = new StudentPart1("name2", "lastname2", Arrays.asList(9f, 7f, 10f));
        dam1.setStudents(Arrays.asList(student1, student2));

        System.out.println("Clasroom average: " + dam1.average());
    }
}