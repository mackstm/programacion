package es.ies.puerto.model.file;

import es.ies.puerto.model.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FileCsvTest {
    FileCsv fileCsv;
    List<Person> people;

    @BeforeEach
    public void beforeEach() {
        fileCsv = new FileCsv();
        people = fileCsv.obtainPeople();
    }

    @Test
    public void obtainPeopleTest() {
        Assertions.assertFalse(people.isEmpty(), "Unexpected result");
    }

    @Test
    public void obtainPersonTest() {
        Person personSearch = new Person(2);
        personSearch = fileCsv.obtainPerson(personSearch);
        Assertions.assertEquals(2, personSearch.getId(), "Unexpected result");
        Assertions.assertNotNull(personSearch.getName(),  "Unexpected result");
        Assertions.assertTrue(personSearch.getAge() > 0,  "Unexpected result");
        Assertions.assertNotNull(personSearch.getEmail(),  "Unexpected result");
    }

    @Test
    public void addPersonTest() {
        String nameInsert = "other";
        int ageInsert = 99;
        String emailInsert = "other@email.com";
        int numPeople = people.size();
        Person personInsert = new Person(5, nameInsert, ageInsert, emailInsert);
        fileCsv.addPerson(personInsert);
        people = fileCsv.obtainPeople();
        int numPeopleInsert = people.size();
        Assertions.assertTrue(people.contains(personInsert), "Unexpected result");
        Assertions.assertEquals(numPeople + 1, numPeopleInsert, "Unexpected result");
    }

    @Test
    public void deletePersonTest() {
        int numPeople = people.size();
        Person perdonDelete = new Person(5);
        fileCsv.deletePerson(perdonDelete);
        people = fileCsv.obtainPeople();
        int numPeopleDelete = people.size();
        Person personObtain = new Person(5);
        Assertions.assertFalse(people.contains(fileCsv.obtainPerson(personObtain)), "Unexpected result");
        Assertions.assertEquals(numPeople - 1, numPeopleDelete, "Unexpected result");
    }
}
