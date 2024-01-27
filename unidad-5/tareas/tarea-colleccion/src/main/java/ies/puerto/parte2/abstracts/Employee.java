package ies.puerto.parte2.abstracts;

/**
 * Employee class that extends worker
 */
public abstract class Employee extends Worker{
    /**
     * Default constructor
     */
    public Employee () {}

    /**
     * Constructor with all relevant parameters
     * @param dni of worker
     * @param name of worker
     * @param dateOfBirth of worker
     * @param salary of worker
     */
    public Employee(String dni, String name, String dateOfBirth, float salary) {
        super(dni, name, dateOfBirth, salary);
    }
}
