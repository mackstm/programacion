package es.ies.puerto.model.file;

import es.ies.puerto.model.Person;
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
        people = new ArrayList<>();
    }

    @Test
    public void obtainPeopleTest() {
        people = fileCsv.obtainPeople();
        Assertions.assertFalse(people.isEmpty(), "Unexpected result");
    }
}
