package ies.puerto.ejercicio4.app;

import ies.puerto.ejercicio4.abstractas.NetConnectionAbstract;
import ies.puerto.ejercicio4.implementation.EthernetConnectionAbs;
import ies.puerto.ejercicio4.implementation.WifiConnectionAbs;

/**
 * Tests functionality for network abstract class and all implementations
 * @author Jose Maximiliano Boada Martin
 */
public class AppNetConnectionAbstract {
    static NetConnectionAbstract ethernet;
    static NetConnectionAbstract wifi;
    public static void main(String[] args) {
        ethernet = new EthernetConnectionAbs();
        wifi = new WifiConnectionAbs();
        System.out.println(ethernet.connect());
        System.out.println(wifi.connect());
    }
}
