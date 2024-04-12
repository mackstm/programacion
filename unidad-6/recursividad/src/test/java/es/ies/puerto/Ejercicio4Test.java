package es.ies.puerto;

import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4Test extends TestUtilities {
    Ejercicio4 ejercicio;
    List<Integer> resultOK;
    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio4();
        resultOK = new ArrayList<>(Arrays.asList(0, 2, 4, 6, 8, 10));
    }

    @Test
    public void evenNumbersTest() {
        Assertions.assertEquals(resultOK, ejercicio.evenNumbersTrad(10), ERR_MSG);
    }

    @Test
    public void evenNumbersRecursiveTest() {
        Assertions.assertEquals(resultOK, ejercicio.evenNumbersRecursive(10), ERR_MSG);
    }
}
