package ies.puerto.parte2.app;

import ies.puerto.parte2.impl.*;

import java.util.Arrays;

/**
 * Tests functionality of school class and all related classes
 * @author Jose Maximiliano Boada Martin
 */
public class AppSchool {
    public static void main(String[] args) {
        //Class instances
        Professor professor1 = new Professor("11111111A", "Samantha", "23/06/1999", 2000.49f,
                "Mathematics");
        Professor professor2 = new Professor("22222222B", "Bob", "01/01/2001", 2000.49f,
                "Science");
        Professor professor3 = new Professor("00000000A", "Jesus Christ", "25/12/0001", 0f,
                "Religion");
        Grade gradeMath1 = new Grade("Mathematics", 10f);
        Grade gradeMath2 = new Grade("Mathematics", 5.5f);
        Grade gradeMath3 = new Grade("Mathematics", 0f);
        Grade gradeScience1 = new Grade("Science", 10f);
        Grade gradeScience2 = new Grade("Science", 4.5f);
        Grade gradeScience3 = new Grade("Science", 3.2f);
        Grade gradeReligion1 = new Grade("Religion", 10f);
        Grade gradeReligion2 = new Grade("Religion", 6.7f);
        Grade gradeReligion3 = new Grade("Religion", 1.9f);
        Student student1 = new Student("21422423R", "Sara", "20/03/2012",
                (Arrays.asList(gradeMath3, gradeScience3, gradeReligion1)));
        Student student2 = new Student("43435534T", "Jim", "12/03/2012",
                (Arrays.asList(gradeMath1, gradeScience1, gradeReligion3)));
        Student student3 = new Student("64564566R", "Joshua", "12/07/2012",
                (Arrays.asList(gradeMath2, gradeScience2)));
        Student student4 = new Student("32423534R", "Drake", "29/02/2012",
                (Arrays.asList(gradeMath1, gradeReligion2)));
        Student student5 = new Student("32423543S", "Nicole", "30/03/2012",
                (Arrays.asList(gradeMath1, gradeScience1, gradeReligion1)));
        Student student6 = new Student("23453535K", "Poptart", "30/01/2012",
                (Arrays.asList(gradeScience3, gradeReligion3, gradeReligion3)));
        Classroom classroom1 = new Classroom("C103", professor1, Arrays.asList(student1, student2));
        Classroom classroom2 = new Classroom("B102", professor2, Arrays.asList(student3, student4));
        Classroom classroom3 = new Classroom("A101", professor3, Arrays.asList(student5, student6));

        School school = new School("Jesus School", "somewhere", "Heaven",
                Arrays.asList(classroom1, classroom2, classroom3));
        System.out.println(school);

        //Max Grade Test
        System.out.println("Max grade in the entire school is: " + school.maxGrade());
        System.out.println();
        //Average classroom grade
        System.out.println("Average in classroom 1 is: " + school.getClassrooms().get(0).average());
        System.out.println("Average in classroom 2 is: " + school.getClassrooms().get(1).average());
        System.out.println("Average in classroom 3 is: " + school.getClassrooms().get(2).average());
        System.out.println();
        //Average grade of entire school
        System.out.println("Average grade of entire school is: " + school.average());
        System.out.println();
        //Average salary of professors
        System.out.println("Average salary of professors is: " + school.averageSalary());
        System.out.println();
        //Maximum and minimum salary
        System.out.println("Minimum salary is: " + school.minSalary());
        System.out.println("Maximum salary is: " + school.maxSalary());
        System.out.println();
        //Search tests
        System.out.println("Looking for " + student1.getDni());
        System.out.println(school.searchStudent(student1.getDni()));
        System.out.println();
        System.out.println("Looking for " + professor3.getDni());
        System.out.println(school.searchProfessor(professor3.getDni()));
        System.out.println();
        System.out.println("Looking for " + classroom2.getName());
        System.out.println(school.searchClassroom(classroom2.getName()));
        System.out.println();

        //Average of ages
        System.out.println("Average age of entire school: " + school.averageAge());
    }
}
