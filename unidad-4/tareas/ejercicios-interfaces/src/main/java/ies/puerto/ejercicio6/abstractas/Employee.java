package ies.puerto.ejercicio6.abstractas;

import ies.puerto.ejercicio6.interfaz.IWorker;

/**
 * Employee abstract class for inheritance
 * @author Jose Maximiliano Boada Martin
 */
public abstract class Employee extends Person implements IWorker{
    /**
     * Properties
     */
    private float salary;
    private String job;

    /**
     * Default constructor
     */
    public Employee() {}

    /**
     * Constructor with name, salary and job parameters.
     * @param name of employee
     * @param salary of employee
     * @param job of employee
     */
    public Employee(String name, float salary, String job) {
        super(name);
        this.salary = salary;
        this.job = job;
    }

    /**
     * Constructor with name, date of birth and job parameters
     * @param name of employee
     * @param dateOfBirth of employee
     * @param job of employee
     */
    public Employee(String name, String dateOfBirth, String job) {
        super(name, dateOfBirth);
        this.job = job;
    }

    /**
     * Constructor with all relevant parameters
     * @param name of employee
     * @param dateOfBirth of employee
     * @param salary of employee
     * @param job of employee
     */
    public Employee(String name, String dateOfBirth, float salary, String job) {
        super(name, dateOfBirth);
        this.salary = salary;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public abstract float calcSalary();

    /**
     * toString override for employee
     * @return employee info
     */
    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nDate of birth: " + getDateOfBirth() +
                "\nSalary: " + salary +
                "\nJob: " + job;
    }
}
