package es.ies.puerto.abstracts;

import es.ies.puerto.interfaces.IVehicle;

import java.util.Objects;

/**
 * Vehicle abstract class
 * @author Jose Maximiliano Boada Martin
 */
public abstract class Vehicle implements IVehicle {
    /**
     * Properties
     */
    private String brand;
    private String model;
    private String licensePlate;
    private int speed;

    /**
     * Default constructor
     */
    public Vehicle() {}

    /**
     * Constructor with license plate property only
     * @param licensePlate of vehicle
     */
    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * Constructor with all relevant parameters
     * @param brand of vehicle
     * @param model of vehicle
     * @param licensePlate of vehicle
     * @param speed of vehicle
     */
    public Vehicle(String brand, String model, String licensePlate, int speed) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.speed = speed;
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

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "{Brand: " + brand +
                ", Model: " + model +
                ", licensePlate: " + licensePlate +
                ", speed: " + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        return Objects.equals(licensePlate, vehicle.licensePlate);
    }

    @Override
    public int hashCode() {
        return licensePlate != null ? licensePlate.hashCode() : 0;
    }
}
