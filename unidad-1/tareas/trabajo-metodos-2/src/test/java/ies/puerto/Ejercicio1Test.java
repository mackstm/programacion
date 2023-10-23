package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    public void checkSalary(int hours, int resultOK) {
        int result = ejercicio1.calcMonthlySalary(hours);
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
}