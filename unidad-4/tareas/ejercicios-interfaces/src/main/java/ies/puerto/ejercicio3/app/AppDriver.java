package ies.puerto.ejercicio3.app;

import ies.puerto.ejercicio3.impl.Automobile;

/**
 * Tests functionality for driver interface and all implementations
 * @author Jose Maximiliano Boada Martin
 */
public class AppDriver {
    static Automobile automobile;
    public static void main(String[] args) {
        automobile = new Automobile();
        System.out.println(automobile.drive());
        System.out.println(automobile.start());
        System.out.println(automobile.stop());
    }
}
