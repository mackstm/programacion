package es.ies.puerto.model.file;

import es.ies.puerto.model.Person;
import es.ies.puerto.model.file.interfaces.ICrudOperations;
import es.ies.puerto.utilities.UtilitiesClass;

import java.util.List;

public class FileXml extends UtilitiesClass implements ICrudOperations {
    @Override
    public List<Person> obtainPeople() {
        return null;
    }

    @Override
    public Person obtainPerson(Person person) {
        return null;
    }

    @Override
    public void addPerson(Person person) {

    }

    @Override
    public void deletePerson(Person person) {

    }

    @Override
    public void updatePerson(Person person) {

    }
}
