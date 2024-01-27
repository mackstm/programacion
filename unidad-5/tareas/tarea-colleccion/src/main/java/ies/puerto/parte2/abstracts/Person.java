package ies.puerto.parte2.abstracts;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * Person abstract class to be extended
 * @author Jose Maximiliano Boada Martin
 */
public abstract class Person {
    /**
     * Properties
     */
    private String dni;
    private String name;
    private String dateOfBirth;

    /**
     * Default Constructor
     */
    public Person() {}

    /**
     * Constructor with all relevant parameters
     * @param dni of person
     * @param name of person
     * @param dateOfBirth self-explanatory
     */
    public Person(String dni, String name, String dateOfBirth) {
        this.dni = dni;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Getters and setters
     */
    public String getDni() {
        return dni;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int calcAge() {
        Calendar currentDate = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try
        {
            Date birthDate = dateFormat.parse(dateOfBirth);
            Calendar birthDateCalendar = Calendar.getInstance();
            birthDateCalendar.setTime(birthDate);

            currentDate.add(Calendar.YEAR, -birthDateCalendar.get(Calendar.YEAR));
            return currentDate.get(Calendar.YEAR);
        } catch (ParseException e) {
            return -1;
        }
    }

    /**
     * Checks if date input is valid
     * @param date input
     * @return true or false
     */
    public boolean dateIsValid(String date) {
        String regex = "^\\d{2}/\\d{2}/\\d{4}$";
        return Pattern.matches(regex, date);
    }

    @Override
    public String toString() {
        return "{DNI:" + dni +
                ", name: " + name +
                ", date of birth: " + dateOfBirth +
                ", age: " + calcAge() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
