package ies.puerto.ejercicio3.impl;

import ies.puerto.ejercicio3.interfaz.IDriver;

/**
 * Automobile class that implements driver interface
 * @author Jose Maximiliano Boada Martin
 */
public class Automobile implements IDriver {

    /**
     * Drive method exclusive to Automobile
     * @return driving message
     */
    public String drive() {
        return "Driving...";
    }

    /**
     * Implementation of start method from interface
     * @return vehicle start message
     */
    @Override
    public String start() {
        return "Starting vehicle...";
    }

    /**
     * Implementation of stop method from interface
     * @return vehicle stop message
     */
    @Override
    public String stop() {
        return "Stopping vehicle...";
    }
}
