package ies.puerto;

import java.util.Objects;

/**
 * Car class that inherits from vehicle
 * @author Jose Maximiliano Boada Martin
 */
public class Car extends Vehicle{
    /**
     * Properties
     */
    private Person driver;
    private int trunkDimensions;

    /**
     * Default constructor
     */
    public Car() {}

    /**
     * Constructor with brand, model, price and driver parameters. Uses parent's constructor
     * @param brand of car
     * @param model of car
     * @param price of car
     * @param driver of car
     * @param trunkDimensions of car
     */
    public Car(String brand, String model, float price, Person driver, int trunkDimensions) {
        super(brand, model, price);
        this.driver = driver;
        this.trunkDimensions = trunkDimensions;
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

    public int getTrunkDimensions() {
        return trunkDimensions;
    }

    public void setTrunkDimensions(int trunkDimensions) {
        this.trunkDimensions = trunkDimensions;
    }

    @Override
    public String toString() {
        return "Brand: " + getBrand() +
                "\nModel: " + getModel() +
                "\nPrice: " + getPrice() +
                "\nTrunk dimensions: " + trunkDimensions +
                "\nDriver info:\n" + driver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return trunkDimensions == car.trunkDimensions && Objects.equals(driver, car.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), driver, trunkDimensions);
    }
}
