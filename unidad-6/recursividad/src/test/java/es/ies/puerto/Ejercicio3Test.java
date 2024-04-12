package es.ies.puerto;

import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test extends TestUtilities {
    Ejercicio3 ejercicio;
    int resultOK = 55;
    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio3();
    }

    @Test
    public void sumTradTest() {
        Assertions.assertEquals(resultOK, ejercicio.sumNumbersTrad(10), ERR_MSG);
    }

    @Test
    public void sumRecursiveTest() {
        Assertions.assertEquals(resultOK, ejercicio.sumNumbersRecursive(10), ERR_MSG);
    }
}
