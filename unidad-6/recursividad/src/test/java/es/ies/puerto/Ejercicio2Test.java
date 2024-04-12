package es.ies.puerto;

import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2Test extends TestUtilities {
    Ejercicio2 ejercicio;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio2();
    }

    @Test
    public void regressiveTest() {
        List<Integer> resultOK = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        List<Integer> result = ejercicio.regressiveCount(10);
        Assertions.assertEquals(resultOK, result, ERR_MSG);
    }

    @Test
    public void regressiveRecursiveTest() {
        List<Integer> resultOK = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        List<Integer> result = ejercicio.regressiveCountRecursive(10);
        Assertions.assertEquals(resultOK, result, ERR_MSG);
    }
}
