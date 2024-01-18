package ies.puerto.app;

import ies.puerto.impl.Circle;
import ies.puerto.impl.Rectangle;
import ies.puerto.impl.Square;
import ies.puerto.interfaz.IGeometricShape;

public class AppGeometricShape {

    static IGeometricShape circle;
    static IGeometricShape rectangle;
    static IGeometricShape square;
    public static void main(String[] args) {
        circle = new Circle(5);
        rectangle = new Rectangle(6, 7);
        square = new Square(5, 5);

        System.out.println("Circle area: " + circle.calcArea());
        System.out.println("Square area: " + square.calcArea());
        System.out.println("Rectangle area: " + rectangle.calcArea());
    }
}
