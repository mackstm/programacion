package es.ies.puerto.vehicles;

import es.ies.puerto.abstracts.Vehicle;

/**
 * Motorcycle class that extends abstract vehicle class
 */
public class Motorcycle extends Vehicle {
    /**
     * Default constructor
     */
    public Motorcycle() {}

    /**
     * Constructor with license plate only
     * @param licensePlate of motorcycle
     */
    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    /**
     * Constructor with all relevant parameters
     * @param brand of motorcycle
     * @param model of motorcycle
     * @param licensePlate of motorcycle
     * @param speed of motorcycle
     */
    public Motorcycle(String brand, String model, String licensePlate, int speed) {
        super(brand, model, licensePlate, speed);
        if (getSpeed() > maximumSpeed()) {
            setSpeed(maximumSpeed());
        }
    }

    /**
     * Max speed method from vehicle interface
     * @return max speed of motorcycle
     */
    @Override
    public int maximumSpeed() {
        return 120;
    }
}
