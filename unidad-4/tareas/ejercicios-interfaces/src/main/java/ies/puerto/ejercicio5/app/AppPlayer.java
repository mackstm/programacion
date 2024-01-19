package ies.puerto.ejercicio5.app;

import ies.puerto.ejercicio5.impl.Guitar;

/**
 * Tests functionality for instrument interface and all implementations
 * @author Jose Maximiliano Boada Martin
 */
public class AppPlayer {
    static Guitar guitar;
    public static void main(String[] args) {
        guitar = new Guitar();
        System.out.println(guitar.changeString());
        System.out.println(guitar.playNote("fa"));
        System.out.println(guitar.tune());
    }
}
