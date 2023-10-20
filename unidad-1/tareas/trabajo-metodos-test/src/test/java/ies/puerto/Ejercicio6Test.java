package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {

    static Ejercicio6 ejercicio6;
    @BeforeAll
    public static void before() {
        ejercicio6 = new Ejercicio6();
    }
    @Test
    public void verifyArmstrongTrueTestOK() {
        int number = 4210818;

        boolean result = ejercicio6.isArmstrong(number);
        Assertions.assertTrue(result, "El numero debe ser Armstrong");
    }
}
