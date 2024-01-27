package ies.puerto.parte2.abstracts;

/**
 * Worker abstract class to be implemented
 * @author Jose Maximiliano Boada Martin
 */
public abstract class Worker extends Person{
    /**
     * Properties
     */
    private float salary;

    /**
     * Default constructor
     */
    public Worker() {}

    /**
     * Constructor with all relevant parameters
     * @param dni of worker
     * @param name of worker
     * @param dateOfBirth of worker
     * @param salary of worker
     */
    public Worker(String dni, String name, String dateOfBirth, float salary) {
        super(dni, name, dateOfBirth);
        this.salary = salary;
    }

    /**
     * Getters and setters
     */
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{DNI:" + getDni() +
                ", name: " + getName() +
                ", date of birth: " + getDateOfBirth() +
                ", age: " + calcAge() +
                ", salary: " + salary + "}";
    }
}
