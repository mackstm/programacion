package ies.puerto.ejercicio6.abstractas;

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

    
}
