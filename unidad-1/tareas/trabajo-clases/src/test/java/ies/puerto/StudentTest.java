package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void detailsTestOK() {
        Student student = new Student("Maxi", 23, "DAM", 7.7f);
        String result = student.printDetails();
        String resultOK = "Name: Maxi\nAge: 23\nDegree: DAM" +
            "\nAverage of grades: 7.7";
        Assertions.assertEquals(resultOK, result);
    }

    @Test
    public void passingGradeTestOK() {
        Student student = new Student("Maxi", 23, "DAM", 7.7f);
        Assertions.assertTrue(student.isPassed());
    }

    @Test
    public void failingGradeTestOK() {
        Student student = new Student("Maxi", 23, "DAM", 4.7f);
        Assertions.assertFalse(student.isPassed());
    }

}
