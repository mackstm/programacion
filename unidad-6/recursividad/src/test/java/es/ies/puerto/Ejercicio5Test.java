package es.ies.puerto;

import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test extends TestUtilities {
    Ejercicio5 ejercicio;
    int resultOK;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio5();

    }

    @Test
    public void powerTradTest() {
        resultOK = 16;
        int result = ejercicio.powerTrad(2, 4);
        Assertions.assertEquals(resultOK, result, ERR_MSG);
    }

    @Test
    public void powerRecursiveTest() {
        resultOK = 16;
        int result = ejercicio.powerRecursive(2, 4);
        Assertions.assertEquals(resultOK, result, ERR_MSG);
    }

    @Test
    public void powerRecursiveZeroTest() {
        resultOK = 1;
        int result = ejercicio.powerRecursive(568, 0);
        Assertions.assertEquals(resultOK, result, ERR_MSG);
    }
}
