package ies.puerto;

import java.util.Objects;

/**
 * Motorcycle class that inherits from vehicle
 * @author Jose Maximiliano Boada Martin
 */
public class Motorcycle extends Vehicle{
    /**
     * Properties
     */
    private Person driver;

    /**
     * Default constructor
     */
    public Motorcycle() {}

    /**
     * Constructor with brand, model, price and driver parameters. Uses parent's constructor
     * @param brand of motorcycle
     * @param model of motorcycle
     * @param price of motorcycle
     * @param driver of motorcycle
     */
    public Motorcycle(String brand, String model, float price, Person driver) {
        super(brand, model, price);
        this.driver = driver;
    }

    /**
     * Getters and setters
     */
    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Brand: " + getBrand() +
                "\nModel: " + getModel() +
                "\nPrice: " + getPrice() +
                "\nDriver info:\n" + driver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorcycle that = (Motorcycle) o;
        return Objects.equals(driver, that.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), driver);
    }
}
