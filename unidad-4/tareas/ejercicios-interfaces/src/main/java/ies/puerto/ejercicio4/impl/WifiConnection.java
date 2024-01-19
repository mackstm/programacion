package ies.puerto.ejercicio4.impl;

import ies.puerto.ejercicio4.interfaz.INetConnection;

/**
 * WiFi connection class that implements net connection interface
 * @author Jose Maximiliano Boada Martin
 */
public class WifiConnection implements INetConnection {
    /**
     * Implementation of connect method from net connection interface
     * @return connection status
     */
    @Override
    public String connect() {
        return "Connecting via WiFi...";
    }
}
