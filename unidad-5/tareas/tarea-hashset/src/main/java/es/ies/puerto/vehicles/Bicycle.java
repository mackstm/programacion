package es.ies.puerto.vehicles;

import es.ies.puerto.abstracts.Vehicle;

/**
 * Bicycle class that extends abstract vehicle class
 */
public class Bicycle extends Vehicle {
    /**
     * Default constructor
     */
    public Bicycle() {}

    /**
     * Constructor with license plate only
     * @param licensePlate of bicycle
     */
    public Bicycle(String licensePlate) {
        super(licensePlate);
    }

    /**
     * Constructor with all relevant parameters
     * @param brand of bicycle
     * @param model of bicycle
     * @param licensePlate of bicycle
     * @param speed of bicycle
     */
    public Bicycle(String brand, String model, String licensePlate, int speed) {
        super(brand, model, licensePlate, speed);
        if (getSpeed() > maximumSpeed()) {
            setSpeed(maximumSpeed());
        }
    }

    /**
     * Max speed method from vehicle interface
     * @return max speed of bicycle
     */
    @Override
    public int maximumSpeed() {
        return 40;
    }
}
