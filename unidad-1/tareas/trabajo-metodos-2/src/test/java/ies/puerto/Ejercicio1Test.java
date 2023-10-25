package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    public void checkSalary(float hours, float resultOK) {
        float result = ejercicio1.calcMonthlySalary(hours);
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }

    @Test
    public void calc10HoursTestOK() {
        checkSalary(10, 100);
    }

    @Test
    public void calc160HoursTestOK() {
        checkSalary(160, 1600);
    }

    @Test
    public void calcFloatHoursTestOK() {
        checkSalary(40.5f, 405);
    }
}