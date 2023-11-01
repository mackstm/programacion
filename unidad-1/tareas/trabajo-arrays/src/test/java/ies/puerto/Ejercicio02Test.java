package ies.puerto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio02Test {
    Ejercicio02 ejercicio02 = new Ejercicio02();

    public void checkArrayAverage(float[] array, float resultOK) {
        float result = ejercicio02.averageOfArray(array);
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }

    @Test
    public void averageTestOK() {
        float[] array = {1.5f, 2.7f, 3.8f};
        checkArrayAverage(array, 2.6666667f);
    }

    @Test
    public void average2TestOK() {
        float[] array = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f};
        checkArrayAverage(array, 4.4f);
    }

    @Test
    public void average3TestOK() {
        float[] array = {0.5f, 0.2f, 0.3f};
        checkArrayAverage(array, 0.33333334f);
    }
}
