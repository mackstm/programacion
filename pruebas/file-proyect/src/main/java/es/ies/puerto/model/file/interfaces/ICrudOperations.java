package es.ies.puerto.model.file.interfaces;

import es.ies.puerto.model.Person;

import java.util.List;

public interface ICrudOperations {
    public List<Person> obtainPeople();
    public Person obtainPerson(Person person);
    public void addPerson(Person person);
    public void deletePerson(Person person);
    public void updatePerson(Person person);
}
