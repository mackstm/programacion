package ies.puerto.ejercicio2.app;

import ies.puerto.ejercicio2.impl.Circle;
import ies.puerto.ejercicio2.impl.Rectangle;
import ies.puerto.ejercicio2.interfaz.IGeometricShape;

/**
 * App to test functionality of geometric shape interface and all implementations
 * @author Jose Maximiliano Boada Martin
 */
public class AppGeometricShape {

    static IGeometricShape circle;
    static IGeometricShape rectangle;
    public static void main(String[] args) {
        circle = new Circle(5);
        rectangle = new Rectangle(6, 7);

        System.out.println("Circle area: " + circle.calcArea());
        System.out.println("Rectangle area: " + rectangle.calcArea());
    }
}
