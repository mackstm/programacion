package ies.puerto.ejercicio2.implementation;

import ies.puerto.ejercicio2.abstractas.GeometricShapeAbstract;

/**
 * Rectangle class with geometric shape abstract class implementation
 * @author Jose Maximiliano Boada Martín
 */
public class RectangleAbs extends GeometricShapeAbstract {

    /**
     * Properties
     */
    private float base;
    private float height;

    /**
     * Default constructor
     */
    public RectangleAbs() {}

    /**
     * Constructor with all necessary parameters
     * @param base of rectangle
     * @param height of rectangle
     */
    public RectangleAbs(float base, float height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Getters and setters
     */

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Implementation of area calculation from interface, for rectangles
     * @return area of rectangle
     */
    @Override
    public float calcArea() {
        return base * height;
    }
}
