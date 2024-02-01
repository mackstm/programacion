package es.ies.puerto.vehicles;

import es.ies.puerto.abstracts.Vehicle;

/**
 * Car class that extends abstract vehicle class
 */
public class Car extends Vehicle {
    /**
     * Default constructor
     */
    public Car() {}

    /**
     * Constructor with license plate only
     * @param licensePlate of car
     */
    public Car(String licensePlate) {
        super(licensePlate);
    }

    /**
     * Constructor with all relevant parameters
     * @param brand of car
     * @param model of car
     * @param licensePlate of car
     * @param speed of car
     */
    public Car(String brand, String model, String licensePlate, int speed) {
        super(brand, model, licensePlate, speed);
        if (getSpeed() > maximumSpeed()) {
            setSpeed(maximumSpeed());
        }
    }

    /**
     * Max speed method from vehicle interface
     * @return max speed of car
     */
    @Override
    public int maximumSpeed() {
        return 180;
    }
}
