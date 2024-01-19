package ies.puerto.ejercicio4.implementation;

import ies.puerto.ejercicio4.abstractas.NetConnectionAbstract;

/**
 * Ethernet connection class that implements net connection abstract class
 * @author Jose Maximiliano Boada Martin
 */
public class EthernetConnectionAbs extends NetConnectionAbstract {
    /**
     * Implementation of connect method from net connection abstract class
     * @return connection status
     */
    @Override
    public String connect() {
        return "Connecting via Ethernet...";
    }
}
