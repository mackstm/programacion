package ies.puerto;

import java.util.Objects;

/**
 * Vehicle class
 * @author Jose Maximiliano Boada Martin
 */
public class Vehicle {
    /**
     * Properties
     */
    private String brand;
    private String model;
    private float price;

    /**
     * Default constructor
     */
    public Vehicle() {}

    /**
     * Constructor with brand, model and price parameters
     * @param brand of vehicle
     * @param model of vehicle
     * @param price of vehicle
     */
    public Vehicle(String brand, String model, float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    /**
     * Getters and setters
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
                "\nModel: " + model +
                "\nPrice: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Float.compare(price, vehicle.price) == 0 && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, price);
    }
}
