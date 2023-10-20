package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    Ejercicio6 ejercicio6;
    @BeforeEach
    public void before() {
        ejercicio6 = new Ejercicio6();
    }

    public void fahrenheitToCelsiusCheck(double number, double resultOK) {
        double result = ejercicio6.fahrenheitToCelsius(number);
        Assertions.assertEquals(resultOK, result, "Resultado no esperado");
    }

    @Test
    public void fahrenheitToCelsiusTest() {
        fahrenheitToCelsiusCheck(100.0, (5.0 / 9.0) * (100.0 - 32.0));
        fahrenheitToCelsiusCheck(-5.0, (5.0 / 9.0) * (-5.0 - 32.0));
        fahrenheitToCelsiusCheck(0, (5.0 / 9.0) * (-32.0));
        fahrenheitToCelsiusCheck(86.786, (5.0/9.0) * (86.786 - 32.0));
    }
}