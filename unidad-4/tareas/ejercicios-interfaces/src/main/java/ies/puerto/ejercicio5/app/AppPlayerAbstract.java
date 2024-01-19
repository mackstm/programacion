package ies.puerto.ejercicio5.app;

import ies.puerto.ejercicio5.implementation.GuitarAbs;

/**
 * Tests functionality for instrument abstract class and all implementations
 * @author Jose Maximiliano Boada Martin
 */
public class AppPlayerAbstract {
    static GuitarAbs guitar;
    public static void main(String[] args) {
        guitar = new GuitarAbs();
        System.out.println(guitar.changeString());
        System.out.println(guitar.playNote("fa"));
        System.out.println(guitar.tune());
    }
}
