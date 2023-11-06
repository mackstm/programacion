package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
    public void checkArea(double radio) {
        Circle circle = new Circle(radio);
        double result = circle.calcArea();
        double resultOK = Math.PI * (radio * radio);
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }
    public void checkCircumference(double radio) {
        Circle circle = new Circle(radio);
        double result = circle.calcCircumference();
        double resultOK = 2 * Math.PI * radio;
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }

    @Test
    public void areaTest1OK() {
        checkArea(7.5);
    }

    @Test
    public void areaTest2OK() {
        checkArea(14);
    }

    @Test
    public void circumferenceTest1OK() {
        checkCircumference(21.33333333333333333333333333333333333333333333333333333333333333333333333333333333333);
    }

    @Test
    public void circumferenceTest2OK() {
        checkCircumference(444.666);
    }
}
