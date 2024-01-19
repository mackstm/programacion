package ies.puerto.ejercicio2.app;

import ies.puerto.ejercicio2.abstractas.GeometricShapeAbstract;
import ies.puerto.ejercicio2.implementation.CircleAbs;
import ies.puerto.ejercicio2.implementation.RectangleAbs;

/**
 * App to test functionality of geometric shape abstract class and all implementations
 * @author Jose Maximiliano Boada Martin
 */
public class AppGeometricShapeAbstract {
    static GeometricShapeAbstract circle;
    static GeometricShapeAbstract rectangle;
    public static void main(String[] args) {
        circle = new CircleAbs(5);
        rectangle = new RectangleAbs(6, 7);

        System.out.println("Circle area: " + circle.calcArea());
        System.out.println("Rectangle area: " + rectangle.calcArea());
    }
}
