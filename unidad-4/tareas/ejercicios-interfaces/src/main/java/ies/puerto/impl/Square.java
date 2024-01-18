package ies.puerto.impl;

import ies.puerto.abstrac.RegularAbstract;
import ies.puerto.interfaz.IGeometricShape;

public class Square extends RegularAbstract implements IGeometricShape {

    public Square() {}

    public Square(float base, float height) {
        super(base, height);
    }

    @Override
    public float calcArea() {
        return getBase() * getBase();
    }
}
