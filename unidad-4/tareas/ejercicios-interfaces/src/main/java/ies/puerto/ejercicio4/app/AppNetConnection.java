package ies.puerto.ejercicio4.app;

import ies.puerto.ejercicio4.impl.EthernetConnection;
import ies.puerto.ejercicio4.impl.WifiConnection;
import ies.puerto.ejercicio4.interfaz.INetConnection;

/**
 * Tests functionality for network interface and all implementations
 * @author Jose Maximiliano Boada Martin
 */
public class AppNetConnection {
    static INetConnection ethernet;
    static INetConnection wifi;
    public static void main(String[] args) {
        ethernet = new EthernetConnection();
        wifi = new WifiConnection();
        System.out.println(ethernet.connect());
        System.out.println(wifi.connect());
    }
}
