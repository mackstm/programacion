package ies.puerto.ejercicio2.impl;

import ies.puerto.ejercicio2.interfaz.IGeometricShape;

/**
 * Circle class with geometric shape interface implementation
 * @author Jose Maximiliano Boada Martín
 */
public class Circle implements IGeometricShape {
    /**
     * Properties
     */
    private float radius;

    /**
     * Default constructor
     */
    public Circle() {}

    /**
     * Constructor with necessary property, radius
     * @param radius of circle
     */
    public Circle(float radius) {
        this.radius = radius;
    }

    /**
     * Getters and setters
     */
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    /**
     * Implementation of area calculation method from interface
     * @return area of circle
     */
    @Override
    public float calcArea() {
        return 3.14f * (radius * radius);
    }
}
