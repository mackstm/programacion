package es.ies.puerto.model.file;

import es.ies.puerto.model.Person;
import es.ies.puerto.model.file.interfaces.ICrudOperations;
import es.ies.puerto.utilities.UtilitiesClass;
import org.simpleframework.xml.Element;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that works with .csv files
 * @author Jose Maximiliano Boada Martin
 */
public class FileCsv extends UtilitiesClass implements ICrudOperations {
    @Element(name = "people")
    List<Person> people;
    String path = "src/main/resources/data.csv";

    public List<Person> obtainPeople() {
        people = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            int counter = 0;
            while ((line = br.readLine()) != null) {
                if (counter > 0) {
                    String[] data = line.split(DELIMIT);
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    int age = Integer.parseInt(data[2]);
                    String email = data[3];
                    Person person = new Person(id, name, age, email);
                    people.add(person);
                }
                counter++;
            }
        } catch (IOException e) {
            System.out.println("File does not exist");
        }
        return people;
    }

    public Person obtainPerson(Person person) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            int counter = 0;
            boolean found = false;
            while ((line = br.readLine()) != null && !found) {
                if (counter > 0) {
                    String[] data = line.split(DELIMIT);
                    int id = Integer.parseInt(data[0]);
                    if (id == person.getId()) {
                        String name = data[1];
                        int age = Integer.parseInt(data[2]);
                        String email = data[3];
                        person.setName(name);
                        person.setAge(age);
                        person.setEmail(email);

                        found = true;
                    }

                }
                counter++;
            }
        } catch (IOException e) {
            System.out.println("File does not exist");
        }
        return person;
    }

    public void addPerson(Person person) {
        Person personSearch = new Person(person.getId());
        personSearch = obtainPerson(personSearch);
        if (personSearch.getEmail() == null) {
            try (FileWriter writer = new FileWriter(path, true)) {
                writer.write(person.toCsv() + "\n");
            } catch (IOException e) {
                System.out.println("File does not exist");
            }
        }
    }

    public void deletePerson(Person person) {
        people = obtainPeople();
        try (FileWriter writer = new FileWriter(path)) {
            writer.write("id,nombre,edad,email\n");
            for (Person element : people) {
                if (!element.equals(person)) {
                    writer.write(element.toCsv() + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("File does not exist");
        }
    }

    public void updatePerson(Person person) {
        people = obtainPeople();
        try (FileWriter writer = new FileWriter(path)) {
            for (Person element : people) {
                if (element.equals(person)) {
                    writer.write(person.toCsv() + "\n");
                } else {
                    writer.write(element.toCsv() + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("File does not exist");
        }
    }
}
