package ies.puerto.ejercicio3.app;


import ies.puerto.ejercicio3.implementation.AutomobileAbs;

/**
 * Tests functionality for driver abstract class and all implementations
 * @author Jose Maximiliano Boada Martin
 */
public class AppDriverAbstract {
    static AutomobileAbs automobile;
    public static void main(String[] args) {
        automobile = new AutomobileAbs();
        System.out.println(automobile.drive());
        System.out.println(automobile.start());
        System.out.println(automobile.stop());
    }
}
