package ies.puerto.ejercicio6.abstractas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * Person abstract class to be extended
 * @author Jose Maximiliano Boada Martin
 */
public abstract class Person {
    /**
     * Properties
     */
    private String name;
    private String dateOfBirth;

    /**
     * Default Constructor
     */
    public Person() {}

    /**
     * Constructor with name parameter
     * @param name of person
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Constructor with name and date of birth parameters
     * @param name of person
     * @param dateOfBirth self-explanatory
     */
    public Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Getters and setters
     */
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

    /**
     * toString override for person
     * @return info of person
     */
    @Override
    public String toString() {
        return "Name: " + name +
                "\nDate of birth: " + dateOfBirth +
                "\nAge: " + calcAge();
    }
}
