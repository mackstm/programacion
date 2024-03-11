package es.ies.puerto.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Test for person class
 * @author Jose Maximiliano Boada Martin
 */
public class PersonTest {
    int id = 1;
    String name = "name";
    int age = 12;
    String email = "test@test.com";

    Person person;
    List<Person> people;

    @BeforeEach
    public void beforeEach() {
        person = new Person(id, name, age, email);
        people = new ArrayList<>();
        people.add(person);
    }

    @Test
    public void createPersonTest() {
        Assertions.assertNotNull(person, "Unexpected result");
    }

    @Test
    public void toStringTest() {
        Assertions.assertTrue(person.toString().contains(String.valueOf(id)), "Unexpected result");
        Assertions.assertTrue(person.toString().contains(name), "Unexpected result");
        Assertions.assertTrue(person.toString().contains(String.valueOf(age)), "Unexpected result");
        Assertions.assertTrue(person.toString().contains(email), "Unexpected result");
    }

    @Test
    public void toCsvTest() {
        Assertions.assertTrue(person.toCsv().contains(String.valueOf(id)), "Unexpected result");
        Assertions.assertTrue(person.toCsv().contains(name), "Unexpected result");
        Assertions.assertTrue(person.toCsv().contains(String.valueOf(age)), "Unexpected result");
        Assertions.assertTrue(person.toCsv().contains(email), "Unexpected result");
        Assertions.assertTrue(person.toCsv().contains(person.DELIMIT), "Unexpected result");
    }

    @Test
    public void equalsTest() {
        Person personEquals = new Person(id);
        Assertions.assertEquals(personEquals, person, "Unexpected result");
    }

    @Test
    public void personToXmlTest() {
        Persister serializer = new Persister();
        try {
            serializer.write(person, new File("src/main/resources/personas.xml"));
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void xmlToPersonTest() {
        Persister serializer = new Persister();
        try {
            File file = new File("src/main/resources/personas.xml");
            Person personRead = serializer.read(Person.class, file);
            Assertions.assertEquals(name, personRead.getName(), "Unexpected result");
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }
}
