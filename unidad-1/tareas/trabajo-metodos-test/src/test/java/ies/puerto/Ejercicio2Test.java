package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void calculoMcdTestOK() {
        int result;
        int resultOK = 5;
        int number1 = 10;
        int number2 = 5;
        result = ejercicio2.mcd(number1, number2);
        Assertions.assertEquals(resultOK, result, "No se ha obtenido el resultado esperado");
    }
}
