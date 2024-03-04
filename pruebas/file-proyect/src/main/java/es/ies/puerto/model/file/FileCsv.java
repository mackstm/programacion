package es.ies.puerto.model.file;

import es.ies.puerto.model.Person;
import es.ies.puerto.utilities.UtilitiesClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that works with .csv files
 * @author Jose Maximiliano Boada Martin
 */
public class FileCsv extends UtilitiesClass {
    String path = "src/main/resources/data.csv";

    public List<Person> obtainPeople() {
        List<Person> people = new ArrayList<>();
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
}
