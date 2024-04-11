package es.ies.puerto;

import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test extends TestUtilities {
    Ejercicio1 ejercicio;
    int resultOK = 24;
    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio1();
    }

    @Test
    public void factorial1Test() {
        Assertions.assertEquals(resultOK, ejercicio.factorial(4), ERR_MSG);
    }

    @Test
    public void factorialRecursiveTest() {
        Assertions.assertEquals(resultOK, ejercicio.factorialRecursive(4), ERR_MSG);
    }
}
