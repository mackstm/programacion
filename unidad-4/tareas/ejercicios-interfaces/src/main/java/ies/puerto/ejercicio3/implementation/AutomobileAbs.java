package ies.puerto.ejercicio3.implementation;

import ies.puerto.ejercicio3.abstractas.DriverAbstract;

/**
 * Automobile class that implements driver abstract class
 * @author Jose Maximiliano Boada Martin
 */
public class AutomobileAbs extends DriverAbstract {

    /**
     * Drive method exclusive to Automobile
     * @return driving message
     */
    public String drive() {
        return "Driving...";
    }

    /**
     * Implementation of start method from abstract class
     * @return vehicle start message
     */
    @Override
    public String start() {
        return "Starting vehicle...";
    }

    /**
     * Implementation of stop method from abstract class
     * @return vehicle stop message
     */
    @Override
    public String stop() {
        return "Stopping vehicle...";
    }
}
