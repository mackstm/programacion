package ies.puerto.ejercicio2.implementation;

import ies.puerto.ejercicio2.abstractas.GeometricShapeAbstract;

/**
 * Circle class with geometric shape abstract class implementation
 * @author Jose Maximiliano Boada Martín
 */
public class CircleAbs extends GeometricShapeAbstract {
    /**
     * Properties
     */
    private float radius;

    /**
     * Default constructor
     */
    public CircleAbs() {}

    /**
     * Constructor with necessary property, radius
     * @param radius of circle
     */
    public CircleAbs(float radius) {
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
