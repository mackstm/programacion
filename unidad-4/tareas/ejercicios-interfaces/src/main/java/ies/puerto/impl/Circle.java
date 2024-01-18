package ies.puerto.impl;

import ies.puerto.interfaz.IGeometricShape;

public class Circle implements IGeometricShape {
    /**
     * Properties
     */
    private float radio;

    public Circle() {}

    public Circle(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcArea() {
        return 3.14f * (radio * radio);
    }
}
