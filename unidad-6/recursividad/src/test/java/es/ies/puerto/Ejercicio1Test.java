package es.ies.puerto;

import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test extends TestUtilities {
    Ejercicio1 exercise;
    int resultOK = 24;
    @BeforeEach
    public void beforeEach() {
        exercise = new Ejercicio1();
    }

    @Test
    public void factorial1Test() {
        Assertions.assertEquals(resultOK, exercise.factorial(4), ERR_MSG);
    }

    @Test
    public void factorialRecursiveTest() {
        Assertions.assertEquals(resultOK, exercise.factorialRecursive(4), ERR_MSG);
    }
}
