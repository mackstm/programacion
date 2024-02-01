package es.ies.puerto.vehicles;

import es.ies.puerto.abstracts.Vehicle;

/**
 * Truck class that extends abstract vehicle class
 */
public class Truck extends Vehicle {
    /**
     * Default constructor
     */
    public Truck() {}

    /**
     * Constructor with license plate only
     * @param licensePlate of truck
     */
    public Truck(String licensePlate) {
        super(licensePlate);
    }

    /**
     * Constructor with all relevant parameters
     * @param brand of truck
     * @param model of truck
     * @param licensePlate of truck
     * @param speed of truck
     */
    public Truck(String brand, String model, String licensePlate, int speed) {
        super(brand, model, licensePlate, speed);
        if (getSpeed() > maximumSpeed()) {
            setSpeed(maximumSpeed());
        }
    }

    /**
     * Max speed method from vehicle interface
     * @return max speed of truck
     */
    @Override
    public int maximumSpeed() {
        return 160;
    }
}
