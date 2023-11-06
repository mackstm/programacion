package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    public void checkArea(float base, float height, float resultOK) {
        Rectangle rectangle = new Rectangle(base, height);
        float result = rectangle.calcArea();
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }

    public void checkPerimeter(float base, float height, float resultOK) {
        Rectangle rectangle = new Rectangle(base, height);
        float result = rectangle.calcPerimeter();
        Assertions.assertEquals(resultOK, result, "Unexpected Result");
    }

    @Test
    public void areaTest1OK() {
        checkArea(5, 5, 25);
    }

    @Test
    public void areaTest2OK() {
        checkArea(3.4f, 6.4f, 21.76f);
    }

    @Test
    public void perimeterTest1OK() {
        checkPerimeter(4, 6, 20);
    }

    @Test
    public void perimeterTest2OK() {
        checkPerimeter(4.5f, 6.9f, 22.8f);
    }
}
