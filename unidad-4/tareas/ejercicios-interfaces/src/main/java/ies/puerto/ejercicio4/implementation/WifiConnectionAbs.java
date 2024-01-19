package ies.puerto.ejercicio4.implementation;

import ies.puerto.ejercicio4.abstractas.NetConnectionAbstract;


/**
 * WiFi connection class that implements net connection abstract class
 * @author Jose Maximiliano Boada Martin
 */
public class WifiConnectionAbs extends NetConnectionAbstract {
    /**
     * Implementation of connect method from net connection abstract class
     * @return connection status
     */
    @Override
    public String connect() {
        return "Connecting via WiFi...";
    }
}
